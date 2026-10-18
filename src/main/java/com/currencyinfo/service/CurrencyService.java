package com.currencyinfo.service;

import com.currencyinfo.dto.GoldDto;
import com.currencyinfo.dto.CurrencyTypeA;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class CurrencyService {

    private final CurrencyClientService currencyClientService;

    public List<GoldDto> getGoldPrice() {
        return currencyClientService.getGoldPrice();
    }

    public List<CurrencyTypeA> getCurrencyPriceTypeA() {
        return currencyClientService.getCurrencyPriceTypeA();
    }
}
