package com.office.member;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Config config = new Config();
		
		Scanner scanner = new Scanner(System.in);
		MemberDB memberDB = new MemberDB();
		
		SystemFlag systemFlag = new SystemFlag();
		
		
		MemberService memberService = new MemberService(memberDB);		
		
		
		if (config.IS_DEV) {
			MemberDummy memberDummy = new MemberDummy(memberDB);
			memberDummy.initMemberDummyData();
		}

		
		/*
		 *  과제1: 더미 데이터 초기화는 개발환경과 실환경으로 구분해야한다.
		 *  깃발새워서하기o
		 */
		
		
		
		while (systemFlag.systemFlag) {
			
			System.out.println("1. SIGN-UP    2. SIGN-IN    3.MODIFY    4.DELETE    5.DO-PRINT-ALL-MEMBERS    99.SYSTEM-OUT");
			int selectedMenu = scanner.nextInt();
			
			switch (selectedMenu) {
			case Menu.SIGN_UP:
				// memberService = new MemberService();
				memberService.doSignUp(scanner);
				
				break;
			
			case Menu.SIGN_IN:
				// memberService = new MemberService();
				
				memberService.doSignIn(scanner, systemFlag);
				
				break;
			
			case Menu.MODIFY:
				
				memberService.doModify(scanner);
				
				break;
			
			case Menu.DELETE:
				
				memberService.doDelete(scanner);
				
				break;
				
			case Menu.DO_PRINT_ALL_MEMBERS:
				memberService.doPrintAllMembers();
				
				
				break;
				
			case Menu.SYSTEM_OUT:
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
