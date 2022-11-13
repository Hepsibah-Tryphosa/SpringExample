package com.springEx.demo.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
@Autowired
	private Gamming game;

	public GameRunner (Gamming game) {
		this.game=game;
	}

	public void run() {
		
		game.up();
		game.down();
		game.left();
		game.right();
		
	}

	
}
