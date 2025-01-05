package com.example.qualifierannotation.config;

import com.example.qualifierannotation.components.Payment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.example.qualifierannotation.components")
public class AppConfig {

    @Bean
    Payment payment1() {
        Payment p = new Payment();
        p.setProviderName("Paypal");
        return p;
    }

    @Bean
    Payment payment2() {
        Payment p = new Payment();
        p.setProviderName("Paytm");
        return p;
    }

    @Bean
    Payment payment3() {
        Payment p = new Payment();
        p.setProviderName("Razorpay");
        return p;
    }
}
