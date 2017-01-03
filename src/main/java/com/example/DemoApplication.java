package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class DemoApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);
	@RequestMapping("/home")
	public String xyz1(){
		logger.info("hiiii");
		String ss = "Print String ddd";
		return ss;
	}
	
	@RequestMapping("/home1")
	public String xyz(){
		logger.info("hello");
		return "bjbscc";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
