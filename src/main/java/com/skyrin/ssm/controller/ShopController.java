package com.skyrin.ssm.controller;

import com.google.gson.Gson;
import com.skyrin.ssm.model.MeShop;
import com.skyrin.ssm.model.MeShopExample;
import com.skyrin.ssm.service.MeShopService;
import com.skyrin.ssm.util.Msg;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
            MeShopExample meShopExample = new MeShopExample();
            meShopExample.setPage(page);
            meShopExample.setPageSize(pageSize);
            List<MeShop> meShopList = meShopService.selectByExample(meShopExample);
            Map map = new HashMap();
            map.put("vendorList", meShopList);
            msg = new Msg(1, "查询成功", map);
        } catch (Exception e) {
            e.printStackTrace();
            msg = new Msg(404, "系统错误—————");
        }
        return gson.toJson(msg);
    }
}
