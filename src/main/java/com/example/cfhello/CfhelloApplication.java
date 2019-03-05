package com.example.cfhello;

import java.time.LocalDateTime;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CfhelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(CfhelloApplication.class, args);
	}
	
	@Value("${configuration.property.value:default_value}")
	private String configProperty;

	@RequestMapping(method=RequestMethod.GET, path="/hello")
	public String hello() {
		return "Greetings at " + LocalDateTime.now() + ", config value: " + configProperty;
	}

}

