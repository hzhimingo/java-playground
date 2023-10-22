package com.hzhimingo.playground.controller;

import com.hzhimingo.playground.service.StockService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {

    private final StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @GetMapping("/stock/deductStock/{goodsId}/{count}")
    public String deductStock(@PathVariable Long goodsId, @PathVariable Integer count) {
        return stockService.deductStock(goodsId, count);
    }
}
