package com.customer.Customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.customer.Customer.controller")
public class CustomerApplication {

	public static void main(String[] args) {


		SpringApplication.run(CustomerApplication.class, args);
	}

}
