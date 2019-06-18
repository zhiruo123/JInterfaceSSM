package com.skyrin.ssm.dao;

import com.skyrin.ssm.model.MeUser;
import com.skyrin.ssm.model.MeUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeUserMapper {
    int countByExample(MeUserExample example);

    int deleteByExample(MeUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MeUser record);

    int insertSelective(MeUser record);

    List<MeUser> selectByExample(MeUserExample example);

    MeUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MeUser record, @Param("example") MeUserExample example);

    int updateByExample(@Param("record") MeUser record, @Param("example") MeUserExample example);

    int updateByPrimaryKeySelective(MeUser record);

    int updateByPrimaryKey(MeUser record);
}