package com.currencyinfo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
class RestClientConfig {
    private static final String NBP_API_URL = "https://api.nbp.pl/api";

    @Bean
    public RestClient nbpRestClient() {
        return RestClient.builder()
                .baseUrl(NBP_API_URL)
                .build();
    }
}
