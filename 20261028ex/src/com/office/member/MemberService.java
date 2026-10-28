package com.office.member;

import java.util.Scanner;

public class MemberService {
	
	// 속성
	MemberDB db;
	
	// 생성자
	public MemberService(MemberDB memberDB) {
		this.db = memberDB;
	}
	
	// 메서드

	// 회원가임
	public void doSignUp(Scanner scanner) {
		
		boolean inputId = true;
		
		String memberId = "";
		
		while (inputId) {
			System.out.println("Input new member ID");
			memberId = scanner.next();
			if (db.memberDB.containsKey(memberId)) {
				System.out.println("아이디가 중복되었습니다. 다시 입력하세요.");
			} else {
				inputId = false;
			}
		}
		
		boolean inputPw = true;
		String memberPw = "";
		
		while (inputPw) {
			System.out.println("Input new member PW");
			memberPw = scanner.next();
			if (memberPw.length() > 12 || memberPw.length() < 8 ) {
				System.out.println("비밀번호는 8~12자리로 입력해야합니다.");
			} else {
				inputPw = false;
			}
			
			
		}
		System.out.println("Input new member MAIL");
		String memberMail = scanner.next();
		
		System.out.println("Input new member PHONE");
		String memberPhone = scanner.next();
		
		Member member = new Member(memberId, memberPw, memberMail, memberPhone);
		// MemberDB db = new MemberDB();
		
		db.memberDB.put(memberId, member);
		
		db.memberDB.get(memberId).printInfo();
		
		/*
		 *  과제4: id 중복 체크 기능 추가o
		 *  과제5: 비밀번호는 8~12 문자로 표현o
		 */
		
	}
	
	// 로그인
	public void doSignIn(Scanner scanner, SystemFlag systemFlag) {
		System.out.println("Input member ID");
		String memberId = scanner.next();
		
		// MemberDB db = new MemberDB();
		Member searchedMember = db.memberDB.get(memberId);
		
		int failLogIn = 0;
		while (failLogIn < 3) {
			
			System.out.println("Input member PW");
			String memberPw = scanner.next();
			
			if (searchedMember != null && searchedMember.memberPw.equals(memberPw)) {
				System.out.println("SIGN-IN SUCCESS!!");
				break;
				
			} else {
				System.out.println("SIGN-IN FAIL!!");
				failLogIn++;
			}
		}
			
		if (failLogIn == 3) {
			System.out.println("로그인 3회 실패! 시스템을 종료합니다.");
			systemFlag.systemFlag = false;			
		}
		
		
	}
	
	/*
	 * 과제6: 로그인 실패 3회 초과면 시스템 종료
	 */
	
	// 정보 수정
	public void doModify(Scanner scanner) {
		
		System.out.println("Input member ID");
		String memberId = scanner.next();
		
		System.out.println("Input member PW");
		String memberPw = scanner.next();
		

		
		Member searchedMember = db.memberDB.get(memberId);
		
		if (searchedMember != null && searchedMember.memberPw.equals(memberPw)) {
			
			System.out.println("변경하려는 PW를 입력하세요.");
			memberPw = scanner.next();
			
			System.out.println("변경하려는 MAIL를 입력하세요.");
			String memberMail = scanner.next();
			
			System.out.println("변경하려는 PHONE를 입력하세요.");
			String memberPhone = scanner.next();
			
			searchedMember.memberPw = memberPw;
			searchedMember.memberMail = memberMail;
			searchedMember.memberPhone = memberPhone;
			System.out.println("정보 변경에 성공하셨습니다.");
			
			// 로깅
			searchedMember = db.memberDB.get(memberId);
			searchedMember.printInfo();
		} else {
			System.out.println("정보 변경에 실패하셨습니다.");
		}


		
		/*
		 *  과제7: id와 패스워드 인증 -> ok -> 정보수정o
		 */
		
	}
	
	// 회원 탈퇴
	public void doDelete(Scanner scanner) {
		
		System.out.println("Input member ID");
		String memberId = scanner.next();
		
		System.out.println("Input member PW");
		String memberPw = scanner.next();
		
		Member searchedMember = db.memberDB.get(memberId);
		
		if (searchedMember != null && searchedMember.memberPw.equals(memberPw)) {
			db.memberDB.remove(memberId);
		}
		
	}
	
	public void doPrintAllMembers() {
	    for (String key : db.memberDB.keySet()) {
	        System.out.println(key);
	    }
	    
	}
		
}
