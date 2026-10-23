package com.office.member;

import java.util.HashMap;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean systemFlag = true;
		
		final int MENU_SIGN_UP = 1;
		final int MENU_SIGN_IN = 2;
		final int MENU_MODIFY = 3;
		final int MENU_DELETE = 4;
		final int MENU_END = 99;
		
		HashMap<String, String[]> members = new HashMap<String, String[]>();
		
		String[] memberInfos;
		
		// dumy data start
		members.put("gildong", new String[] {"gildong", "1234", "gildong@gmail.com", "010-1234-5678"});
		members.put("chanho", new String[] {"chanho", "0000", "chanho@naver.com", "010-2222-3333"});
		
		memberInfos = members.get("gildong");
		for (int i = 0; i < memberInfos.length; i++) {
			System.out.println(memberInfos[i]);
		}
		
		while (systemFlag) {
			
			System.out.println("1.SIGN-UP    2.SIGN-IN    3.MODIFY    4.DELETE    99.END");
			
			int selectedMenuNumber = scanner.nextInt();
			
			String memberID;
			String memberPW;
			String memberMail;
			String memberPhone;
			
			
			switch(selectedMenuNumber) {
				case MENU_SIGN_UP:							// SIGN-UP
					
					System.out.println("Input new member ID");
					memberID = scanner.next();
					
					System.out.println("Input new member Pw");
					memberPW = scanner.next();
					
					System.out.println("Input new member MAIL");
					memberMail = scanner.next();
					
					System.out.println("Input new member PHONE");
					memberPhone = scanner.next();
					
					members.put(memberID, new String[] {memberID ,memberPW, memberMail, memberPhone});
					
					memberInfos = members.get(memberID);
					
					for (int i = 0; i < memberInfos.length; i++) {
						System.out.println(memberInfos[i]);
					}
//					// foreach
//					for (String memberInfo : memberInfos) {
//						System.out.println(memberInfo);
//					}
					
					break;
					
				case MENU_SIGN_IN:							// 2.SIGN-IN
					
					System.out.println("Input member ID");
					memberID = scanner.next();
					
					System.out.println("Input member PW");
					memberPW = scanner.next();
					
					memberInfos = members.get(memberID);
					System.out.println("memberInfos: " + memberInfos);
					
					if (memberInfos != null && memberInfos[1].equals(memberPW)) {
							System.out.println("SIGN-IN SUCCESS");						
					} else {
						// ID null == 로그인 실패
						System.out.println("SIGN-IN FAIL");
					}
					
					break;
					
				case MENU_MODIFY:							// 3.MODIFY
					
					System.out.println("Input member ID");
					memberID = scanner.next();
					
					System.out.println("Input member Pw");
					memberPW = scanner.next();
					
					System.out.println("Input member MAIL");
					memberMail = scanner.next();
					
					System.out.println("Input member PHONE");
					memberPhone = scanner.next();
					
					memberInfos = members.get(memberID);
					
					if (memberInfos != null) {
						memberInfos[1] = memberPW;
						memberInfos[2] = memberMail;
						memberInfos[3] = memberPhone;
						
						String[] tempInfos = members.get(memberID);
						for (String tempInfo : tempInfos) {
							System.out.println(tempInfo);
						}
						
					} else {
						System.out.println("존재하지 않는 ID입니다. 다시 확인하세요.");
					}
					
					break;
					
				case MENU_DELETE:							// 4.DELETE
					
					System.out.println("Input member ID");
					memberID = scanner.next();
					
					System.out.println("Input member PW");
					memberPW = scanner.next();
					
					memberInfos = members.get(memberID);
					if (memberInfos != null && memberInfos[1].equals(memberPW)) {
							members.remove(memberID);
							System.out.println("삭제 처리 이후: "+ members.get(memberID)); 
					} else {
						System.out.println("존재하지 않는 ID입니다. 다시 확인하세요.");
					}										
					break;
					
				case MENU_END:
					
					System.out.println("Good Bye");
					systemFlag = false;
					break;
			}
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scanner.close();

	}

}
