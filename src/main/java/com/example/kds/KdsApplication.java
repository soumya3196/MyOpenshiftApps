package com.example.kds;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class KdsApplication {
	
	@GetMapping
	public String Msg()
	{
		return  "This is Springboot deployment to Openshift";
		
	}

	public static void main(String[] args) {
		SpringApplication.run(KdsApplication.class, args);
	}

}
