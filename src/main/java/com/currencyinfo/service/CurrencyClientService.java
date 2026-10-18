package com.currencyinfo.service;

import com.currencyinfo.dto.GoldDto;
import com.currencyinfo.dto.CurrencyTypeA;

import java.util.List;

public interface CurrencyClientService {
    List<GoldDto> getGoldPrice();
    List<CurrencyTypeA> getCurrencyPriceTypeA();

}
