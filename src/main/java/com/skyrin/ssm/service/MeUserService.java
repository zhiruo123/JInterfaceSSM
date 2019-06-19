package com.skyrin.ssm.service;

import com.skyrin.ssm.model.MeUser;

/**
 * @Author £ºzhazhatao.
 * @Date £ºCreated in 10:40 2019/6/18
 * @Description£º
 * @Modified By£º
 * @Version: 1.0
 */
public interface MeUserService {
    public int insert(MeUser record);
    MeUser selectByUsername(String username);

}
