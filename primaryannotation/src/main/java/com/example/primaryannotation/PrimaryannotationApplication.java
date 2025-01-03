package com.example.primaryannotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class PrimaryannotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimaryannotationApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Payment payment = context.getBean(Payment.class);
		System.out.println(payment.getProviderName());
	}

}
