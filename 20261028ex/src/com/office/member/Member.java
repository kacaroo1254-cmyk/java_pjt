package com.office.member;

public class Member {
	
	// 멤버필드
	/*
	 * 아이디, 비밀번호, 메일주소, 연락처
	 */
	String memberId;
	String memberPw;
	String memberMail;
	String memberPhone;
	
	// 생성자
	public Member() {
	
	}
	
	public Member(String memberId, String memberPw, String memberMail, String memberPhone) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberMail = memberMail;
		this.memberPhone = memberPhone;
	}


	// 메서드
	
	// 회원정보 출력 기능
	public void pringInfo() {
		System.out.println("-----------------------------------------------");
		System.out.println("Member ID: " + memberId);
		System.out.println("Member PW: " + memberPw);
		System.out.println("Member MAIL: " + memberMail);
		System.out.println("Member PHONE: " + memberPhone);
	}
	
	
	
	
}
