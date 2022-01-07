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
		return  "Hai  dear santosh sir, This is  Springboot deployment to Openshift by soumya";
		
	}

	public static void main(String[] args) {
		SpringApplication.run(KdsApplication.class, args);
	}

}
