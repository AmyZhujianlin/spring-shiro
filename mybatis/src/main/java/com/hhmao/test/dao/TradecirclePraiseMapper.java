package com.hhmao.test.dao;

import com.hhmao.test.entity.TradecirclePraise;

public interface TradecirclePraiseMapper {
    int deleteByPrimaryKey(String id);

    int insert(TradecirclePraise record);

    int insertSelective(TradecirclePraise record);

    TradecirclePraise selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TradecirclePraise record);

    int updateByPrimaryKey(TradecirclePraise record);
}