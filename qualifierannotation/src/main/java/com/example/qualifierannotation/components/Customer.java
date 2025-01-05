package com.example.qualifierannotation.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer {

    private String name = "Bushan";
    private Payment payment;

//    @Autowired
//    public Customer(@Qualifier("payment3") Payment payment) {
//        this.payment = payment;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Payment getPayment() {
        return payment;
    }

    @Autowired
    public void setPayment(@Qualifier("payment3") Payment payment) {
        this.payment = payment;
    }
}
