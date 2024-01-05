package com.example.demoinjection;

import com.example.demoinjection.config.AppConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(AppConfig.class)
public class DemoInjectionApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoInjectionApplication.class, args);
	}
}

