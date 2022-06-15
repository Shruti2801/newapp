package com.example.newapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class NewappApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewappApplication.class, args);
	}

}
