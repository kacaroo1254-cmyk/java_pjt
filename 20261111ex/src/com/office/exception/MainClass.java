package com.office.exception;

public class MainClass {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 0;
		
		System.out.println("num1 + num2 =" + (num1 + num2));
		
		/*
		 * 예외 처리: try ~ catch문
		 */
		
		try {
			System.out.println("num1 / num2 =" + (num1 / num2));
		} catch (Exception e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("finally");	  		// 예외가 발생하던 안하던 반드시 실행 (ex.데이터베이스 커넥션 자를때 많이사용)
		}
		
		System.out.println("num1 - num2 =" + (num1 - num2));
		System.out.println("num1 * num2 =" + (num1 * num2));
		
		
	}
	
}
