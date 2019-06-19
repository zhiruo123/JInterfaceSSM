package com.skyrin.ssm.controller;

import com.google.gson.Gson;
import com.skyrin.ssm.model.MeShop;
import com.skyrin.ssm.model.MeShopExample;
import com.skyrin.ssm.model.MeShopReturn;
import com.skyrin.ssm.service.MeShopService;
import com.skyrin.ssm.util.Msg;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.*;

/**
 * @Author ：zhazhatao.
 * @Date ：Created in 16:40 2019/6/18
 * @Description：
 * @Modified By：
 * @Version: 1.0
 */
@RestController
@RequestMapping("/shop")
public class ShopController {
    @Autowired
    MeShopService meShopService;

    /**
     * 商户信息接口
     * @param pageSize 每页数量
     * @param page 页号
     * @param latitude 商户经度
     * @param longitude 商户纬度
     * @return
     */
    @RequestMapping(value = "/getShops",produces = "text/html; charset=utf-8", method = {RequestMethod.GET , RequestMethod.POST})
    public String getShops(@Param("pageSize") int pageSize , int page , String latitude , String longitude) {
        Msg msg = new Msg();
        Gson gson = new Gson();
        try {
            if (longitude == null || latitude == null) {
                msg = new Msg(414, "经纬度不能为空—————");
            }
            MeShopExample meShopExample = new MeShopExample();
            meShopExample.setPage(page);
            meShopExample.setPageSize(pageSize);
            List<MeShop> meShopList = meShopService.selectByExample(meShopExample);
            List<MeShopReturn> meShopReturnList = new ArrayList<>();
            Iterator<MeShop> meShopIterator = meShopList.iterator();
            while(meShopIterator.hasNext()) {
                MeShop meShop = meShopIterator.next();
                MeShopReturn meShopReturn = new MeShopReturn();
                fatherToChild(meShop, meShopReturn);
                int range = algorithm(Double.valueOf(meShop.getShopLongitude()), Double.valueOf(meShop.getShopLatitude()) ,
                        Double.valueOf(longitude) , Double.valueOf(latitude));
                meShopReturn.setDistance(range);
                meShopReturnList.add(meShopReturn);
            }
            Map map = new HashMap();
            map.put("vendorList", meShopReturnList);
            msg = new Msg(1, "查询成功", map);
        } catch (Exception e) {
            e.printStackTrace();
            msg = new Msg(404, "系统错误—————");
        }
        return gson.toJson(msg);
    }

    @RequestMapping(value = "/searchShop",produces = "text/html; charset=utf-8", method = {RequestMethod.GET , RequestMethod.POST})
    public String searchShop(int pageSize , int page , String latitude , String longitude , String type , String range) {
        Msg msg = new Msg();
        Gson gson = new Gson();
        try {
            MeShopExample meShopExample = new MeShopExample();
            meShopExample.setPage(page);
            meShopExample.setPageSize(pageSize);
            if (type != null && type.length()>0) {
                if (type.equals("1")) {
                    meShopExample.setShopType("餐饮美食");
                } else if (type.equals("2")) {
                    meShopExample.setShopType("休闲娱乐");
                }
            }
            List<MeShop> meShopList = meShopService.selectByExample(meShopExample);

            if (range != null && !range.equals("3")) {
                Iterator<MeShop> meShopIterator = meShopList.iterator();
                while (meShopIterator.hasNext()) {
                    MeShop meShop = meShopIterator.next();
                    int range2 = algorithm(Double.valueOf(meShop.getShopLongitude()), Double.valueOf(meShop.getShopLatitude()) ,
                            Double.valueOf(longitude) , Double.valueOf(latitude));
                    int range1;
                    if (range .equals("1")) {
                        range1 =500;
                    } else {
                        range1 = 1000;
                    }
                    if (range2 >= range1) {
                        meShopIterator.remove();
                    }
                }
            }
            Map map = new HashMap();
            List<MeShopReturn> meShopReturnList = new ArrayList<>();
            Iterator<MeShop> meShopIterator = meShopList.iterator();
            while(meShopIterator.hasNext()) {
                MeShop meShop = meShopIterator.next();
                MeShopReturn meShopReturn = new MeShopReturn();
                fatherToChild(meShop, meShopReturn);
                int distance = algorithm(Double.valueOf(meShop.getShopLongitude()), Double.valueOf(meShop.getShopLatitude()) ,
                        Double.valueOf(longitude) , Double.valueOf(latitude));
                meShopReturn.setDistance(distance);
                meShopReturnList.add(meShopReturn);
            }
            map.put("vendorList", meShopReturnList);
            msg = new Msg(1, "查询成功", map);
            msg = new Msg(1, "搜索成功", map);
        } catch (Exception e) {
            e.printStackTrace();
            msg = new Msg(404, "系统错误—————");
        }
        return gson.toJson(msg);
    }

    /**
     * 角度转换成弧度
     * @param d
     * @return
     */
    private static double rad(double d) {
        return d * Math.PI / 180.00; //角度转换成弧度
    }

    /**
     *经纬度计算距离
     * @param longitude1
     * @param latitude1
     * @param longitude2
     * @param latitude2
     * @return
     */
    public static int algorithm(double longitude1, double latitude1, double longitude2, double latitude2) {

        double Lat1 = rad(latitude1); // 纬度

        double Lat2 = rad(latitude2);

        double a = Lat1 - Lat2;//两点纬度之差

        double b = rad(longitude1) - rad(longitude2); //经度之差

        double s = 2 * Math.asin(Math

                .sqrt(Math.pow(Math.sin(a / 2), 2) + Math.cos(Lat1) * Math.cos(Lat2) * Math.pow(Math.sin(b / 2), 2)));//计算两点距离的公式

        s = s * 6378137.0;//弧长乘地球半径（半径为米）

        s = Math.round(s * 10000d) / 10000d;//精确距离的数值

        return (int) s;

    }

    public static <T>void fatherToChild(T father,T child) throws Exception {
        if (child.getClass().getSuperclass()!=father.getClass()){
            throw new Exception("child 不是 father 的子类");
        }
        Class<?> fatherClass = father.getClass();
        Field[] declaredFields = fatherClass.getDeclaredFields();
        for (int i = 0; i < declaredFields.length; i++) {
            Field field=declaredFields[i];
            Method method=fatherClass.getDeclaredMethod("get"+upperHeadChar(field.getName()));
            Object obj = method.invoke(father);
            field.setAccessible(true);
            field.set(child,obj);
        }

    }

    /**
     * 首字母大写，in:deleteDate，out:DeleteDate
     */
    public static String upperHeadChar(String in) {
        String head = in.substring(0, 1);
        String out = head.toUpperCase() + in.substring(1, in.length());
        return out;
    }
}
