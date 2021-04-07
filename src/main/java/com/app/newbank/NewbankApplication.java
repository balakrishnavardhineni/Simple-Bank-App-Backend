package com.app.newbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@SpringBootApplication
public class NewbankApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewbankApplication.class, args);
	}
}
