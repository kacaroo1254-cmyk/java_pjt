package com.office.exception;

public class StringBuilderEx {
	
	public static void main(String[] args) {
		
		String str = "";
		
		long beforeCurrentTime = System.currentTimeMillis();
		
		for (int i = 0; i < 100000; i++) {
			str += "s";
		}
		
		long afterCurrentTime = System.currentTimeMillis();
		
		System.out.println("경과 시간1: " + (afterCurrentTime - beforeCurrentTime));
		
		System.out.println("------------------------------------------------------");
		
		beforeCurrentTime = System.currentTimeMillis();
		
		StringBuilder stringBuilder = new StringBuilder();
		
		for (int i = 0; i < 100000; i++) {
			stringBuilder.append("s");
		}
		
		afterCurrentTime = System.currentTimeMillis();
		
		System.out.println("경과 시간2: " + (afterCurrentTime - beforeCurrentTime));
		
		
	}
	

}
