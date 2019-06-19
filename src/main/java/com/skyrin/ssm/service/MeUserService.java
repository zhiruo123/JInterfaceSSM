package com.skyrin.ssm.service;

import com.skyrin.ssm.model.MeUser;

public interface MeUserService {
    public int insert(MeUser record);
    MeUser selectByUsername(String username);

}
