package com.skyrin.ssm.controller;

import com.google.gson.Gson;
import com.skyrin.ssm.model.MeUser;
import com.skyrin.ssm.service.MeUserService;
import com.skyrin.ssm.util.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ：zhazhatao.
 * @Date ：Created in 14:35 2019/6/18
 * @Description：
 * @Modified By：
 * @Version: 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    MeUserService meUserService;

    @RequestMapping(value = "/register",produces = "text/html; charset=utf-8", method = {RequestMethod.GET , RequestMethod.POST})
    public String register(String username , String password) {
        Msg msg = new Msg();
        Gson gson = new Gson();
        if(username == null || password == null) {
            msg = new Msg(2, "用户名密码不能为空");
        } else {
            try {
                MeUser meUser = meUserService.selectByUsername(username);
                if (meUser == null) {
                    meUser = new MeUser();
                    meUser.setPassword(password);
                    meUser.setUsername(username);
                    int i = meUserService.insert(meUser);
                    if (i == 1) {
                        msg = new Msg(i, "注册成功");
                    } else {
                        msg = new Msg(i, "注册失败");
                    }
                } else {
                    msg = new Msg(3, "用户已存在");
                }
            } catch (Exception e) {
                e.printStackTrace();
                msg = new Msg(404, "系统错误—————");
            }
        }
        return gson.toJson(msg);
    }

    @RequestMapping(value = "/login",produces = "text/html; charset=utf-8", method = {RequestMethod.GET , RequestMethod.POST})

    public String login(String username , String password) {
        Msg msg = new Msg();
        Gson gson = new Gson();
        try {
            MeUser meUser = meUserService.selectByUsername(username);
            if (meUser == null) {
                msg = new Msg(0 , "用户不存在");
            } else {
                if (meUser.getPassword() .equals(password) ) {
                    msg = new Msg(1 , "登陆成功");
                } else {
                    msg = new Msg(2, "密码错误");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            msg = new Msg(404, "系统错误—————");
        }
        return gson.toJson(msg);
    }
}
