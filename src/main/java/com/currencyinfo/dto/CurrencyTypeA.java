package com.currencyinfo.dto;

import java.time.LocalDate;
import java.util.List;

public record CurrencyTypeA(
    String table,
    String no,
    LocalDate effectiveDate,
    List<Rates> rates
) {
}
