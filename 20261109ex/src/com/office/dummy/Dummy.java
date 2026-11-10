package com.office.dummy;

import com.office.Container;
import com.office.member.MemberDto;

public class Dummy {
	
	private String[] memIds = {"gildong", "chanho"};
	private String[] memPws = {"1234", "5678"};
	private String[] memMails = {"gildong@gmail.com", "chanho@naver.com"};
	private String[] memPhones = {"010-1234-5678", "010-1234-9012"};
	
	public void setDummy() {
		
		for (int i = 0; i < memIds.length; i++) {
			
			MemberDto memberDto = new MemberDto(
					memIds[i], memPws[i], memMails[i], memPhones[i]
							);
			
			Container.getInstance().getMemberService().signUp(memberDto);
					
		}
	}

}
