package com.example.k8.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
@SpringBootApplication

public class K8DemoApplication {
    
	public static void main(String[] args) {
		SpringApplication.run(K8DemoApplication.class, args);
	}
	
	@GetMapping("/message")
	public String getMessage() {
		return "You have deployed your application to kubernetes";
	}


}
