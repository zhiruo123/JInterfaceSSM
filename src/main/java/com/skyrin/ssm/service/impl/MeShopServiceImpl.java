package com.skyrin.ssm.service.impl;

import com.skyrin.ssm.dao.MeShopMapper;
import com.skyrin.ssm.model.MeShop;
import com.skyrin.ssm.model.MeShopExample;
import com.skyrin.ssm.service.MeShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author ：zhazhatao.
 * @Date ：Created in 16:41 2019/6/18
 * @Description：
 * @Modified By：
 * @Version: 1.0
 */
@Service
public class MeShopServiceImpl implements MeShopService {
    @Autowired
    MeShopMapper meShopMapper;


    @Override
    public List<MeShop> selectByExample(MeShopExample example) {
        return meShopMapper.selectByExample(example);
    }
}
