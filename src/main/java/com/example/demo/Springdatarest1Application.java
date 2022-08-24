package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableConfigurationProperties
@ComponentScan(basePackages ={"com.example.*"})
@EnableJpaRepositories("com.example.*")
@EntityScan(basePackages = {"com.example.*"})
public class Springdatarest1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springdatarest1Application.class, args);
	}

}
