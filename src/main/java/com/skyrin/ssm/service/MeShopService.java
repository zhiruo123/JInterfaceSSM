package com.skyrin.ssm.service;

import com.skyrin.ssm.model.MeShop;
import com.skyrin.ssm.model.MeShopExample;

import java.util.List;

/**
 * @Author ：zhazhatao.
 * @Date ：Created in 16:41 2019/6/18
 * @Description：
 * @Modified By：
 * @Version: 1.0
 */
public interface MeShopService {
    List<MeShop> selectByExample(MeShopExample example);
}
