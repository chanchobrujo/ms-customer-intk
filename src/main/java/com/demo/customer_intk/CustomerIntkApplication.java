package com.demo.customer_intk;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@OpenAPIDefinition(
		info = @Info(
				title = "Microservicio customer",
				version = "1.0",
				description = "Microservicio que consume informacion de los cliente registrados en la base de datos.",
				contact = @Contact(
						name = "Kevin Anderson Palma Lluen",
						url = "https://github.com/chanchobrujo",
						email = "umb.kevsidorov@gmail.com"
				)
		))
@SpringBootApplication
public class CustomerIntkApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerIntkApplication.class, args);
	}

}
