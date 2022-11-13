package com.springEx.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springEx.demo.game.Agame;
import com.springEx.demo.game.Bgame;
import com.springEx.demo.game.GameRunner;
import com.springEx.demo.game.Gamming;
import com.springEx.demo.game.agame;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context
		=SpringApplication.run(DemoApplication.class, args);
		
		
		
		
		//Agame game=new Agame();
		//Gamming game = new Bgame();
		//GameRunner runner=new GameRunner(game);
		
		
		
		GameRunner runner=context.getBean(GameRunner.class);
		runner.run();	
		
		
	}

}
