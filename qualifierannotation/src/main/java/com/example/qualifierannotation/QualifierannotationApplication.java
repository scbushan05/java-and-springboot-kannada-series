package com.example.qualifierannotation;

import com.example.qualifierannotation.components.Customer;
import com.example.qualifierannotation.components.Payment;
import com.example.qualifierannotation.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class QualifierannotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(QualifierannotationApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Customer customer = context.getBean(Customer.class);
		System.out.println(customer.getName());
		System.out.println(customer.getPayment().getProviderName());
	}

}
