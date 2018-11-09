package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.springboot.configuration.JpaConfiguration;


@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"com.springboot"})// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class SpringBootApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApp.class, args);
	}
}
