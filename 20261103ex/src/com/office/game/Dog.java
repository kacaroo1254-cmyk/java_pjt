package com.office.game;

public class Dog implements ICharactor {
	
	public void run(int x, int y) {
		System.out.printf("%d, %d로 네발로 이동한다.\n", x, y);
	}

}
