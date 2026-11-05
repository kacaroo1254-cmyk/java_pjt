package com.office.member;

import java.util.Scanner;

public class MemberService implements IMemberService{
	
	final private MemberDao memberDao = 
			MemberContainer.getInstance().getMemberDao();
	
	@Override
	public void signUp(MemberDto memberDto) {

		// 아이디 중복체크
		boolean isMember = memberDao.isMember(memberDto.getMemId());
		
		// 회원가입
		if (!isMember) {
			int result = memberDao.insertNewMember(memberDto); 	// 0: 실패, 	1: 성공
			if (result == 0) {
				System.out.println("죄송합니다. 회원가입 실패입니다. 잠시 후 다시 시도해주세요.");
			} else {
				System.out.println("회원가입 성공");
			}
		} else {
			System.out.println("이미 존재하는 ID입니다.");
		}
		
	}

	@Override
	public void signIn(MemberDto memberDto) {

		MemberDto serchedMemberDto = memberDao.searchMemberByMemIdAndMemPw(memberDto);
		
		if (serchedMemberDto != null) {
			System.out.println("로그인 성공!!");
		} else {
			System.out.println("로그인 실패!!");
		}
		
	}

	@Override
	public void modify(MemberDto memberDto) {

		MemberDto updatedMemberDto = memberDao.updateMemberByMemId(memberDto);
		
		if (updatedMemberDto != null) {
			System.out.println("Modify SUCCESS!!");
		} else {
			System.out.println("Modify FAIL!!");
		}
		
	}

	@Override
	public void delete(MemberDto memberDto) {
		
		MemberDto deletedMemberDto = memberDao.deleteMemberByMemIdAndMemPw(memberDto);
		
		if (deletedMemberDto != null) {
			System.out.println("탈퇴처리 완료되었습니다.");
		} else {
			System.out.println("탈퇴처리 실패했습니다.");
		}
		
	}

	public boolean doAuthenticationByMemIdAndMemPw(MemberDto memberDto) {
		
		MemberDto dto = memberDao.searchMemberByMemIdAndMemPw(memberDto);

		return dto != null ? true : false;
	}
	
	
	
	

}
