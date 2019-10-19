package com.indreams.sbhelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SbHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbHelloWorldApplication.class, args);
	}

	@GetMapping(path = "/")
	public String hello(){
		return "Hello World";
	}
}
