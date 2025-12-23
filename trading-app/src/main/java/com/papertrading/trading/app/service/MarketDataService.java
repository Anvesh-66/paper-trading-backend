package com.papertrading.trading.app.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;
import java.util.Objects;

@Service
public class MarketDataService {
    private final RestTemplate restTemplate = new RestTemplate();
    public double getBitcoinPriceInInr(){

        String url =
                "https://api.coingecko.com/api/v3/simple/price?ids=bitcoin&vs_currencies=inr";
        Map<String, Map<String, Object>> response =
                restTemplate.getForObject(url, Map.class);

        Object priceObj = response.get("bitcoin").get("inr");
        return ((Number) priceObj).doubleValue();
    }


}
