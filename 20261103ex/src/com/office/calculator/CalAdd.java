package com.office.calculator;

public class CalAdd implements ICalculator {
	/*
	private int calAdd(int n1, int n2) {
		int result = n1 + n2;
		return result;
//		System.out.println("result: " + result);
	}
	*/

	@Override
	public int doOperator(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
}
