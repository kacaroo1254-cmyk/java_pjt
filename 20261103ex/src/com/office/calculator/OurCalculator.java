package com.office.calculator;

public class OurCalculator {
	
	public void calAdd(int n1, int n2) {
//		int result = n1 + n2;
		ICalculator iCalculator = new CalAdd();
		int result = iCalculator.doOperator(n1, n2);
		System.out.println("result: " + result);
	}
	
	public void calSub(int n1, int n2) {
//		int result = n1 - n2;
		ICalculator iCalculator = new CalSub();
		int result = iCalculator.doOperator(n1, n2);
		System.out.println("result: " + result);
	}
	
	public void calMul(int n1, int n2) {
//		int result = n1 * n2;
		ICalculator iCalculator = new CalMul();
		int result = iCalculator.doOperator(n1, n2);
		System.out.println("result: " + result);
	}
	
	public void calDiv(int n1, int n2) {
//		float result = (float)n1 / n2;
		ICalculator iCalculator = new CalDiv();
		int result = iCalculator.doOperator(n1, n2);
		System.out.println("result: " + result);
	}
	
}
