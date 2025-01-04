package com.example.setterinjection;

import com.example.setterinjection.components.Customer;
import com.example.setterinjection.components.Payment;
import com.example.setterinjection.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SetterinjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SetterinjectionApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Payment payment = context.getBean(Payment.class);
		Customer customer = context.getBean(Customer.class);
		System.out.println(payment.getProviderName());
		System.out.println(customer.getName());
		System.out.println(customer.getPayment());
	}

}
