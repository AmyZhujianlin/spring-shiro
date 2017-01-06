package com.hhmao.test.dao;

import com.hhmao.test.entity.TradecircleCommonts;

public interface TradecircleCommontsMapper {
    int deleteByPrimaryKey(String id);

    int insert(TradecircleCommonts record);

    int insertSelective(TradecircleCommonts record);

    TradecircleCommonts selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TradecircleCommonts record);

    int updateByPrimaryKey(TradecircleCommonts record);
}