package com.example.autowireannotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.autowireannotation.components")
public class AppConfig {
}
