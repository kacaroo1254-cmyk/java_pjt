package com.office.menu;

import java.util.HashMap;

import com.office.session.Session;

public class Menu {
	
	/*
	 * 멤버 필드
	 */
	
	final public static int MEMBER_SIGN_UP = 1;
	final public static int MEMBER_SIGN_IN = 2;
	final public static int MEMBER_SIGN_OUT = 3;
	final public static int MEMBER_MODIFY = 4;
	final public static int MEMBER_DELETE = 5;
	
	final public static int DIARY_WRITE = 6;
	final public static int DIARY_READ = 7;
	
	final public static int SYSTEM_OUT = 99;
	
	/*
	 * 메서드
	 */
	
	public static void generateMenu() {
		
		HashMap<String, Object> attributes =  Session.getInstance().getAttributes();
		Object object = attributes.get("signInedMemberId");
		
		if (object == null) {
			System.out.println("1.SIGN-UP    2.SIGN-IN    99.SYSTEM-OUT");
		} else {
			System.out.println("3.SIGN-OUT    4.MODIFY    5.DELETE    6.DIARY-WRITE    7.DIARY-READ     99.SYSTEM-OUT");
		}
		
	}

}
