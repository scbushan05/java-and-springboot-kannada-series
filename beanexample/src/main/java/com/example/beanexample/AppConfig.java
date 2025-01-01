package com.example.beanexample;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "paypal")
    Payment payment() {
        Payment p = new Payment();
        p.setProviderName("Paypal");
        return p;
    }

    @Bean(value = "paytm")
    Payment payment1() {
        Payment p = new Payment();
        p.setProviderName("Paytm");
        return p;
    }

    @Bean
    String name() {
        return "Bushan";
    }
}
