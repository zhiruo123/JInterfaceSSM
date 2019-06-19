package com.skyrin.ssm.dao;

import com.skyrin.ssm.model.MeShop;
import com.skyrin.ssm.model.MeShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeShopMapper {
    int countByExample(MeShopExample example);

    int deleteByExample(MeShopExample example);

    int deleteByPrimaryKey(Integer shopId);

    int insert(MeShop record);

    int insertSelective(MeShop record);

    List<MeShop> selectByExample(MeShopExample example);

    MeShop selectByPrimaryKey(Integer shopId);

    int updateByExampleSelective(@Param("record") MeShop record, @Param("example") MeShopExample example);

    int updateByExample(@Param("record") MeShop record, @Param("example") MeShopExample example);

    int updateByPrimaryKeySelective(MeShop record);

    int updateByPrimaryKey(MeShop record);
}