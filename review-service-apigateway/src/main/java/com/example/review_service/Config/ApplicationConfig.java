package com.example.review_service.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationConfig {

    // Define RestTemplate as a Spring Bean
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
