package com.hhmao.core.server.market.dao;

import com.hhmao.core.market.schema.tradecircle.TradecirclePraise;

public interface TradecirclePraiseMapper {
    int deleteByPrimaryKey(String id);

    int insert(TradecirclePraise record);

    int insertSelective(TradecirclePraise record);

    TradecirclePraise selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TradecirclePraise record);

    int updateByPrimaryKey(TradecirclePraise record);
}