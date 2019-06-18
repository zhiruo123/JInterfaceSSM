package com.skyrin.ssm.controller;

import com.skyrin.ssm.service.MeShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
