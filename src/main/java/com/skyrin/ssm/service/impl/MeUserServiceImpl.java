package com.skyrin.ssm.service.impl;

import com.skyrin.ssm.dao.MeUserMapper;
import com.skyrin.ssm.model.MeUser;
import com.skyrin.ssm.service.MeUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author ��zhazhatao.
 * @Date ��Created in 10:41 2019/6/18
 * @Description��
 * @Modified By��
 * @Version: 1.0
 */

@Service
public class MeUserServiceImpl implements MeUserService {

    @Autowired
    MeUserMapper meUserMapper;

    @Override
    public int insert(MeUser record) {
        int i = meUserMapper.insert(record);
        return i;
    }

    @Override
    public MeUser selectByUsername(String username) {
        MeUser meUser = meUserMapper.selectByUsername(username);
        return meUser;
    }

}
