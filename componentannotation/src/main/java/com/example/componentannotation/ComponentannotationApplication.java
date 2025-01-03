package com.example.componentannotation;

import com.example.components.Payment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ComponentannotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComponentannotationApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Payment payment = context.getBean(Payment.class);
		System.out.println(payment.printHello());
	}

}
