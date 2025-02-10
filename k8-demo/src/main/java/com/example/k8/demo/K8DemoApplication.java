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
	
	@GetMapping("/docker")
	public String getGreetings() {
		return "You have deployed your application to docker";
	}
	
	@GetMapping("/kubernetes")
	public String getMessage() {
		return "You have deployed your application to kubernetes";
	}
	
	@GetMapping("/prolifics")
	public String getDetails() {
		return "Welcome to prolifics";
	}
	
	@GetMapping("/Hello")
	public String getHi() {
		return "Hi";
	}


}
