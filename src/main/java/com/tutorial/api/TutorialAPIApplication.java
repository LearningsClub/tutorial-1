package com.tutorial.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class TutorialAPIApplication {
	public static void main(String[] args) {
		SpringApplication.run(TutorialAPIApplication.class, args);
	}
}