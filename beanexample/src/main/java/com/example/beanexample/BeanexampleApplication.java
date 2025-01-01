package com.example.beanexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BeanexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanexampleApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Payment paypalBean = context.getBean("paypal", Payment.class);
		System.out.println(paypalBean.getProviderName());
		Payment paytmBean = context.getBean("paytm", Payment.class);
		System.out.println(paytmBean.getProviderName());
		Payment paytmBean1 = (Payment) context.getBean("paytm");
		System.out.println(paytmBean1.getProviderName());
		String name = context.getBean(String.class);
		System.out.println(name);
	}

}
