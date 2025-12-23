package com.papertrading.trading.app.controller;

import com.papertrading.trading.app.service.MarketDataService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class MarketController {
    private final MarketDataService marketDataService;
    public MarketController(MarketDataService marketDataService) {
        this.marketDataService = marketDataService;
    }
    @GetMapping("/price/btc")
    public double getBtcPrice() {
        return marketDataService.getBitcoinPriceInInr();
    }


}
