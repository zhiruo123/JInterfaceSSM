package com.skyrin.ssm.service;

import com.skyrin.ssm.model.MeUser;

/**
 * @Author ��zhazhatao.
 * @Date ��Created in 10:40 2019/6/18
 * @Description��
 * @Modified By��
 * @Version: 1.0
 */
public interface MeUserService {
    public int insert(MeUser record);
    MeUser selectByUsername(String username);

}
