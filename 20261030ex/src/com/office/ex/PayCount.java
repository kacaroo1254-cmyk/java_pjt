package com.office.ex;

/*
 * 싱글톤 클래스로 만들자!!
 */

public class PayCount {

	// 속성
	private static PayCount payCount = null;
	private int cnt = 0;
	
	// 생성자
	private PayCount() {
	
	}
	
	// 메서드
	public static PayCount getPayCountInstance() {
		if (payCount == null) {
			payCount = new PayCount();
		}
		return payCount;
	}
	
	// 조회
	public int getCnt() {
		return cnt;
	}
	
	// 설정
	public void setCnt() {
		this.cnt++;
	}
	
	
	
	
}
