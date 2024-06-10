package com.hzhimingo.playground.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface StockRepository {

    @Select("select stock from goods_stock where goods_id = #{goodsId}")
    Integer selectStockByGoodsId(@Param("goodsId") Long goodsId);

    @Update("update goods_stock set stock = #{stock} where goods_id = #{goodsId}")
    Integer updateStockByGoodsId(@Param("goodsId") Long goodsId, @Param("stock") Integer stock);
}