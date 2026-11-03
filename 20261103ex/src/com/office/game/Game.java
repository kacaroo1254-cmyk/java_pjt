package com.office.game;

public class Game {
	
	private Bear bear;
	private Robot robot;
	private AirPlane airPlane;
	private Dog dog;
	private ICharactor[] iCharactors;
	
	public Game(Bear bear, Robot robot, AirPlane airPlane, Dog dog) {
		this.bear = bear;
		this.robot = robot;
		this.airPlane = airPlane;
		this.dog = dog;
		
		iCharactors = new ICharactor[] {
				this.bear,
				this.robot,
				this.airPlane,
				this.dog
		};
		
	}

	public void move(int x, int y) {
//		bear.walk(x, y);
//		robot.run(x, y);
//		dog.run(x, y);
//		airPlane.fly(x, y);
		
//		bear.run(x, y);
//		robot.run(x, y);
//		airPlane.run(x, y);
//		dog.run(x, y);
		
		for (int i = 0; i < iCharactors.length; i++) {
			iCharactors[i].run(x, y);
		}
		
	}

}
