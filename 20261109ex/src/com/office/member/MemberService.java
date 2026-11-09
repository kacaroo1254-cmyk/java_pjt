package com.office.member;

public class MemberService {
	
	final private MemberDao memberDao;
	
	final public static int SIGN_UP_FAIL = 0;					// 많아지면 인터페이스로 올릴생각
	final public static int SIGN_UP_SUCCESS = 1;

	public MemberService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public int signUp(MemberDto memberDto) {

		boolean isMember = memberDao.isMember(memberDto.getMemId());
		
		if (!isMember) {
			return memberDao.insertMember(memberDto);
		} else {
			return SIGN_UP_FAIL;
		}
		
	}

	public MemberDto signIn(MemberDto memberDto) {
		MemberDto selectedMemberDto = 
				memberDao.selectMemberByMemId(memberDto.getMemId());
		
		if (selectedMemberDto != null 
				&& 
				selectedMemberDto.getMemPw().equals(memberDto.getMemPw())) {
				return selectedMemberDto;
			} else {
				return null;
			}
		
	}

	
	
}
