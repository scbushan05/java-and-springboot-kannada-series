package com.example.primaryannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean
    Payment payment() {
        Payment p = new Payment();
        p.setProviderName("Paypal");
        return p;
    }

    @Primary
    @Bean
    Payment payment1() {
        Payment p = new Payment();
        p.setProviderName("Paytm");
        return p;
    }

    @Primary
    @Bean
    Payment payment2() {
        Payment p = new Payment();
        p.setProviderName("Razorpay");
        return p;
    }
}
