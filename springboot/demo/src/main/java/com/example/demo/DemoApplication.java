package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@EnableConfigurationProperties(AuthorSettings.class)
public class DemoApplication {
	@Autowired
	private AuthorSettings authorSettings;
	
	@RequestMapping("/")
	public String index() {
		return "author name is " + authorSettings.getName() + " and author age is " + authorSettings.getAge();
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
