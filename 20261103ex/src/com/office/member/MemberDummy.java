package com.office.member;

public class MemberDummy {
	
	private String[] memberIds = {"gildong", "chanho"};
	private String[] memberPws = {"1234", "5678"};
	private String[] memberMails = {"gildong@gmail.com", "chanho@naver.com"};
	private String[] memberPhones = {"010-1234-5678", "010-0000-0000"};
	
	public void signUpforDumy(MemberService memberService) {
		
		for (int i = 0; i < memberIds.length; i++) {
			MemberDto memberDto = new MemberDto(
					memberIds[i],
					memberPws[i],
					memberMails[i],
					memberPhones[i]);
			memberService.signUp(memberDto);
		}
		

	}
	
	
}
