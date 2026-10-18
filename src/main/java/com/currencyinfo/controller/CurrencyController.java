package com.currencyinfo.controller;

import com.currencyinfo.dto.GoldDto;
import com.currencyinfo.dto.CurrencyTypeA;
import com.currencyinfo.service.CurrencyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
class CurrencyController {

    private final CurrencyService currencyService;

    @GetMapping("/gold")
    public List<GoldDto> getGoldPrice() {
        return currencyService.getGoldPrice();
    }

    @GetMapping("/type-a")
    public List<CurrencyTypeA> getCurrencyPriceTypeA() {
        return currencyService.getCurrencyPriceTypeA();
    }

}
