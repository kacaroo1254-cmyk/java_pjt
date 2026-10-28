package com.office.member;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		MemberDB memberDB = new MemberDB();
		
		SystemFlag systemFlag = new SystemFlag();
		
		
		MemberService memberService = new MemberService(memberDB);		
		
		boolean dummyFlag = true;
		if (dummyFlag) {
			MemberDummy memberDummy = new MemberDummy(memberDB);
			memberDummy.initMemberDummyData();
		}

		
		/*
		 *  과제1: 더미 데이터 초기화는 개발환경과 실환경으로 구분해야한다.
		 *  깃발새워서하기o
		 */
		
		final int SIGN_UP = 1;
		final int SIGN_IN = 2;
		final int MODIFY = 3;
		final int DELETE = 4;
		final int DO_PRINT_ALL_MEMBERS = 5;
		final int SYSTEM_OUT = 99;
		
		
		while (systemFlag.systemFlag) {
			
			System.out.println("1. SIGN-UP    2. SIGN-IN    3.MODIFY    4.DELETE    5.DO-PRINT-ALL-MEMBERS    99.SYSTEM-OUT");
			int selectedMenu = scanner.nextInt();
			
			switch (selectedMenu) {
			case SIGN_UP:
				// memberService = new MemberService();
				memberService.doSignUp(scanner);
				
				break;
			
			case SIGN_IN:
				// memberService = new MemberService();
				
				memberService.doSignIn(scanner, systemFlag);
				
				break;
			
			case MODIFY:
				
				memberService.doModify(scanner);
				
				break;
			
			case DELETE:
				
				memberService.doDelete(scanner);
				
				break;
				
			case DO_PRINT_ALL_MEMBERS:
				memberService.doPrintAllMembers();
				
				
				break;
				
			case SYSTEM_OUT:
				systemFlag.systemFlag = false;
				System.out.println("Goodbye");
				break;
				
				/*
				 * 과제2: case에 사용되는 리터럴 상수 -> 상수로 변경o
				 * 과제3: 메뉴 5번을 만들어서 전체회원정보 출력하는 기능o
				 */

			default:
				
				break;
			}

		}
				
		scanner.close();
		
	}

}
