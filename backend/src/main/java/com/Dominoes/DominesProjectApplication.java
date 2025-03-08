package com.Dominoes;

import com.Dominoes.DAO.*;
import com.Dominoes.model.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class DominesProjectApplication {

	public static void main(String[] args) {

		SpringApplication.run(DominesProjectApplication.class, args);
	}

	@GetMapping("/greet")
	public String firstrun(){
		return "Hello ";
	}

	@Bean
	CommandLineRunner runner(IuserJPA IuserJPA, IuserHistoryJPA IuserHistoryJPA, IgameJPA IgameJPA,
							 IplayerJPA IplayeJPA, ItilePoolJPA ItilePoolJPA,ItileJPA ItileJPA) {

		return args -> {

			game game1 = new game();
			game game2 = new game();
			game game3 = new game();
			game game4 = new game();
			game game5 = new game();
			game game6 = new game();
			game game7 = new game();
			game game8 = new game();

			List<game> games = List.of(game1, game2, game3, game4, game5, game6, game7, game8);
			IgameJPA.saveAll(games);





			userHistory ibrahimHistory = new userHistory(List.of(game3,game4,game5,game6,game7), List.of(game1,game2,game8));
			userHistory sheriffHistory = new userHistory(List.of(game1,game2,game8),List.of(game3,game4,game5,game6,game7));

			List<userHistory> userHistories = List.of(ibrahimHistory,sheriffHistory);
			IuserHistoryJPA.saveAll(userHistories);


			mUser Ibrahim = new mUser("Ibrahim", "password", "Ibrahim@gmail.com", "+4915730807199",
					new profile("'/Users/inagy/Downloads/avatar.jpg'",ibrahimHistory,true,"boardleader"),
					new address("auf der Union","4b","45141","essen","NRW","Deutschland"));
			mUser sherif = new mUser("sherif", "password", "sherif@gmail.com", "+491632164867",
					new profile("'/Users/inagy/Downloads/avatar.jpg'",sheriffHistory,true,"boardleader"),
					new address("Bülowstraße","51","45479","Mülheim an der Ruhr","NRW","Deutschland"));

			List<mUser> users = List.of(Ibrahim, sherif);
			IuserJPA.saveAll(users);


			/*tilePool tilePool = new tilePool();
			ItileJPA.saveAll(tilePool.getTiles());
			ItilePoolJPA.save(tilePool);
			player Tarek = new player(1,game1,100,tilePool);
			IplayeJPA.save(Tarek);

			 */



		};

	}

}
