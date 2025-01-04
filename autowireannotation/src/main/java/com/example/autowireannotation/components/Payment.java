package com.example.autowireannotation.components;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Payment {

    private String providerName = "Paypal";

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String printHello() {
        return "Hello...";
    }

    @Override
    public String toString() {
        return "Payment{" +
                "providerName='" + providerName + '\'' +
                '}';
    }
}
