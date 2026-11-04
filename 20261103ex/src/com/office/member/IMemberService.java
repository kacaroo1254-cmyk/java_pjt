package com.office.member;

import java.util.Scanner;

public interface IMemberService {
	
	public void signUp(MemberDto memberdto);
	
	public void signIn(MemberDto memberDto);
	
	public void modify();
	
	public void delete(MemberDto memberDto);

}
