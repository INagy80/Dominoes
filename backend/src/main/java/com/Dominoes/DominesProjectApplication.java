package com.Dominoes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DominesProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(DominesProjectApplication.class, args);
	}

	@GetMapping("/greet")
	public String firstrun(){
		return "This is a firstrun";
	}

}
