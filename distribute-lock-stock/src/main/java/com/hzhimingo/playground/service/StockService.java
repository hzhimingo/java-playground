package com.hzhimingo.playground.service;

import com.hzhimingo.playground.dao.StockRepository;
import org.springframework.stereotype.Service;

@Service
public class StockService {

    private final StockRepository stockRepository;

    public StockService(StockRepository stockRepository) {
        this.stockRepository = stockRepository;
    }

    public String deductStock(Long goodsId, Integer count) {
        // 查询商品库存的库存数量
        Integer stock = stockRepository.selectStockByGoodsId(goodsId);
        // 判断库存数量是否足够
        if (stock < count) {
            return "库存不足";
        }
        // 如果库存数量足够，那么就去扣减库存
        stockRepository.updateStockByGoodsId(goodsId, stock - count);
        return "库存扣减成功";
    }

}
