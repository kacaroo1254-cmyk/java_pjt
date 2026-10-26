package com.office.classex03;

public class Car {
	
	// 속성
	String carcolor;
	String carNumber;
	
	// 생성자
	public Car(String carColor, String carNumber) {
		this.carcolor = carColor;
		this.carNumber = carNumber;
	}
	
	// 기능
	public void printCarInfo() {
		System.out.println("carcolor: " + carcolor);
		System.out.println("carNumber: " + carNumber);
	}
	
	
}
