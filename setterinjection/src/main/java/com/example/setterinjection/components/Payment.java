package com.example.setterinjection.components;

import org.springframework.beans.factory.annotation.Autowired;
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
