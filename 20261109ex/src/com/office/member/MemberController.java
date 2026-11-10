package com.office.member;

import java.util.Scanner;

import com.office.config.Config;
import com.office.menu.Menu;
import com.office.session.Session;

public class MemberController {
	
	/*
	 * 멤버 필드
	 */
	
	final private MemberService memberService;
	
	/*
	 * 생성자
	 */
	
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}
	
	/*
	 * 메서드
	 */

	public void execute(Scanner scanner, int selectedMenu) {
		
		String memId;
		String memPw;
		String memMail;
		String memPhone;
		
		switch (selectedMenu) {
		case Menu.MEMBER_SIGN_UP:
			
			System.out.println("Input new member ID!!");
			memId = scanner.next();
			
			System.out.println("Input new member PW!!");
			memPw = scanner.next();
			
			System.out.println("Input new member MAIL!!");
			memMail = scanner.next();
			
			System.out.println("Input new member PHONE!!");
			memPhone = scanner.next();
			
			int resultForSignUp = memberService.signUp(
					new MemberDto(memId, memPw, memMail, memPhone));
			
			if (resultForSignUp == MemberService.SIGN_UP_SUCCESS) {
				System.out.println("SIGN-UP SUCCESS!!");
			} else {
				System.out.println("SIGN-UP FAIL!!");
			}
			
			break;
		case Menu.MEMBER_SIGN_IN:
			
			System.out.println("Input member ID!!");
			memId = scanner.next();
			
			System.out.println("Input member PW!!");
			memPw = scanner.next();
			
			MemberDto signInedMemberDto = memberService.signIn(
					new MemberDto(memId, memPw, null, null));
			
			if (signInedMemberDto != null) {
				System.out.println("SIGN-IN SUCCESS!!");
				Session.getInstance().setAttribute(
						Config.SIGNINED_MEMBER_ID, 
						signInedMemberDto.getMemId());
				
			} else {
				System.out.println("SIGN-IN FAIL!!");
			}
			
			break;
		case Menu.MEMBER_SIGN_OUT:
			
			Session.getInstance().removeAttribute(Config.SIGNINED_MEMBER_ID);
			
			break;
		case Menu.MEMBER_MODIFY:
			
			MemberDto signedInMemberDto = memberService.getMember();
			
			System.out.println("MemberID: " + signedInMemberDto.getMemId());
			System.out.println("MemberPW: " + signedInMemberDto.getMemPw());
			System.out.println("MemberMAIL: " + signedInMemberDto.getMemMail());
			System.out.println("MemberPHONE: " + signedInMemberDto.getMemPhone());
			
			System.out.println("Input member new PW!!");
			memPw = scanner.next();
			
			System.out.println("Input member new MAIL!!");
			memMail = scanner.next();
			
			System.out.println("Input member new PHONE!!");
			memPhone = scanner.next();
			
			int resultForModify =
					memberService.modify(new MemberDto(
							String.valueOf(Session.getInstance().getAttribute(Config.SIGNINED_MEMBER_ID)), 
							memPw, 
							memMail, 
							memPhone
							));
			if (resultForModify == MemberService.MODIFY_SUCCESS) {
				System.out.println("MEMBER UPDATE SUCCESS!!");
			} else {
				System.out.println("MEMBER UPDATE FAIL!!");
			}
			
			break;
			
		case Menu.MEMBER_DELETE:
			
			int resultForDelete = memberService.delete(
					String.valueOf(Session.getInstance().getAttribute(Config.SIGNINED_MEMBER_ID)));
			
			if (resultForDelete == MemberService.DELETE_SUCCESS) {
				System.out.println("MEMBER DELETE SUCCESS!!");
				Session.getInstance().removeAttribute(Config.SIGNINED_MEMBER_ID);
			} else {
				System.out.println("MEMBER DELETE FAIL!!");
			}
			
			break;
		
		}
		
	}

}
