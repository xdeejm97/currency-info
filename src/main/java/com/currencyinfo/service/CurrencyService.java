package com.currencyinfo.service;


import com.currencyinfo.dto.GoldDto;
import com.currencyinfo.dto.USD_PLN_Dto;

import java.util.List;

public interface CurrencyService {


    List<GoldDto> getGoldData();
    USD_PLN_Dto getUSDPLNExchangeData();

}
