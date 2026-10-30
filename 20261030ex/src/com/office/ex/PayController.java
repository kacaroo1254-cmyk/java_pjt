package com.office.ex;

import java.util.Scanner;

public class PayController {
	
	/*
	 * 월급 지급 명령을 내린다. 
	 */
	
	public void execute() {
		
		Scanner scanner = new Scanner(System.in);
		
		while (PayCount.getPayCountInstance().getCnt() < 12) {
			System.out.println("Please enter the month");
			int thisMonth = scanner.nextInt();
			
			PayService payService = new PayService();
			payService.pay(thisMonth);
			
		}
		
		
		
		scanner.close();
		
	}
	
	
	
}
