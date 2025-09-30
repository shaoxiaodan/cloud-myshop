package com.shaoxiaodan.cart;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@EnableFeignClients()
@OpenAPIDefinition(
	info = @Info(
			title = "${apidocs.info.title}", 
			version = "${apidocs.info.version}", 
			description = "${apidocs.info.description}", 
			contact = @Contact(
					name = "${apidocs.contact.name}", 
					url = "${apidocs.contact.url}",
					email = "${apidocs.contact.email}")))
@MapperScan("com.shaoxaodan.cart.mapper")
@SpringBootApplication
public class CartApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartApplication.class, args);
	}
	
}
