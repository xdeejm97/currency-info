package com.currencyinfo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
class RestClientConfig {
    private final String nbpApiUrl;

    RestClientConfig(@Value("${nbp.api.url}") String nbpApiUrl) {
        this.nbpApiUrl = nbpApiUrl;
    }

    @Bean
    public RestClient nbpRestClient() {
        return RestClient.builder()
                .baseUrl(nbpApiUrl)
                .build();
    }
}
