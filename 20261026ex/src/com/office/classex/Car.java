package com.office.classex;

public class Car {
	
	// 속성
	String color = "Black";
	double size = 5.2;
	int displacement = 2000;
	
	// 생성자
	public Car() {
			System.out.println("Car CONSTRUCHTOR CALLED!!");
	}
	
	// 기능
	public void drive() {
		System.out.println("DRIVE() CALLED!!");
	}
	
	public void parking() {
		System.out.println("PARKING() CALLED!!");
	}
	
	public void stop() {
		System.out.println("STOP() CALLED!!");
	}
	
	public void callAllMethod() {
		drive();
		parking();
		stop();
	}
	
}
