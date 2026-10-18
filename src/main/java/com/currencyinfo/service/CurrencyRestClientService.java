package com.currencyinfo.service;

import com.currencyinfo.dto.GoldDto;
import com.currencyinfo.dto.CurrencyTypeA;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import java.util.List;

@Component
@RequiredArgsConstructor
class CurrencyRestClientService implements CurrencyClientService {

    private final RestClient nbpRestClient;

    @Override
    public List<GoldDto> getGoldPrice() {
        return nbpRestClient
            .get()
            .uri("/cenyzlota", GoldDto.class)
            .retrieve()
            .body(new ParameterizedTypeReference<List<GoldDto>>() {});
    }

    @Override
    public List<CurrencyTypeA> getCurrencyPriceTypeA() {
        return nbpRestClient
            .get()
            .uri("/exchangerates/tables/a/", CurrencyTypeA.class)
            .retrieve()
            .body(new ParameterizedTypeReference<List<CurrencyTypeA>>() {});
    }
}
