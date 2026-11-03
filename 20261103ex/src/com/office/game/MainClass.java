package com.office.game;

public class MainClass {
	
	public static void main(String[] args) {
		
		Game game = new Game(new Bear(), new Robot(), new AirPlane(), new Dog());

		game.move(200, 300);
		
	}

}
