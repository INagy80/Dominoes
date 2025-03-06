package com.Dominoes;

import com.Dominoes.DAO.IplayerJPA;
import com.Dominoes.model.player;
import org.springframework.boot.CommandLineRunner;
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

	CommandLineRunner Runner (IplayerJPA playerJPA) {
		return args -> {
			player Tarek = new player(1212,"Taroka",1200 );
			player Chayma = new player(1234,"Chayma",1000 );
			playerJPA.save(Tarek);
			playerJPA.save(Chayma);
		};
	}

}
