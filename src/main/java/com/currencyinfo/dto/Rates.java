package com.currencyinfo.dto;

public record Rates(
    String currency,
    String code,
    float mid
) {}