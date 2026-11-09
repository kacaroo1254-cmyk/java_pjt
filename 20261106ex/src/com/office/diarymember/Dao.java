package com.office.diarymember;

import java.util.ArrayList;
import java.util.HashMap;

public class Dao {
	
	HashMap<String, MemberDto> db = new HashMap<String, MemberDto>();
	
	private ArrayList<String> diaries = new ArrayList<String>();

	public Dao() {
	}

	public boolean isMember(String memId) {
		
		return db.get(memId) != null ? true : false;
	}

	public boolean insertNewMember(MemberDto memberDto) {
		
		db.put(memberDto.getMemId(), memberDto);
		
		return db.get(memberDto.getMemId()) != null ? true:false;
		
	}
	
	public MemberDto searchedMemberByIdAndPw(MemberDto memberDto) {
		
		MemberDto dto = db.get(memberDto.getMemId());
		
		if (dto != null && dto.getMemPw().equals(memberDto.getMemPw())) {
			return dto;
		} else {
			return null;
		}

	}

	public MemberDto updateMemberByMemId(MemberDto memberDto) {
		
		db.put(memberDto.getMemId(), memberDto);
		
		return db.get(memberDto.getMemId());
	}

	public void deleteMemberByIdAndPw(MemberDto memberDto) {
		
		MemberDto dto = db.get(memberDto.getMemId());
		
		if (dto != null && dto.getMemPw().equals(memberDto.getMemPw())) {
			db.remove(memberDto.getMemId());
		}
		
	}
	
	
	
	

}
