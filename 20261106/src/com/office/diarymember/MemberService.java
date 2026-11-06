package com.office.diarymember;

public class MemberService implements IMemberService {
	
	final private Dao dao;
	final private DiaryService diaryService;
	
	public MemberService(Dao dao, DiaryService diaryService) {
		this.dao = dao;
		this.diaryService = diaryService;
	}

	@Override
	public void signUp(MemberDto memberDto) {
		
		boolean isMember = dao.isMember(memberDto.getMemId());
		
		if (!isMember) {
			if (dao.insertNewMember(memberDto)) {
				System.out.println("회원가입에 성공했습니다.");
			} else {
				System.out.println("죄송합니다. 회원가입에 실패하였습니다. 잠시 후 다시 시도해주세요.");
			}
		} else {
			System.out.println("이미 존재하는 아이디입니다.");
		}
		
	}

	@Override
	public void signIn(MemberDto memberDto) {
		if (dao.searchedMemberByIdAndPw(memberDto) != null) {
			System.out.println("로그인 성공!!");
		} else {
			System.out.println("로그인 실패!!");
		}
		
	}

	@Override
	public void modify(MemberDto memberDto) {
		
		MemberDto updatedMemberDto = dao.updateMemberByMemId(memberDto);
		
		if (updatedMemberDto != null) {
			System.out.println("정보수정이 완료되었습니다.");
		} else {
			System.out.println("정보수정을 실패하였습니다.");
		}
		
		
	}

	@Override
	public void delete(MemberDto memberDto) {
		
		dao.deleteMemberByIdAndPw(memberDto);
		
	}

	public boolean doAuthenticationByMemIdAndMemPw(MemberDto memberDto) {
		
		MemberDto dto = dao.searchedMemberByIdAndPw(memberDto);
		
		return dto != null ? true : false;
	}
	

}
