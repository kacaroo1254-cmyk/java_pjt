package com.office.member;

public class MemberContainer {
	
	private final MemberDao MEMBER_DAO = new MemberDao();
	private final MemberService MEMBER_SERVICE = new MemberService(MEMBER_DAO);
	private final MemberController MEMBER_CONTROLLER = new MemberController(MEMBER_SERVICE);
	
	private static MemberContainer memberContainer;
	
	private MemberContainer() {
		
	}
	
	public static MemberContainer getInstance() {
		if (memberContainer == null) {
			memberContainer = new MemberContainer();
		}
		return memberContainer;
	}

	public MemberController getMemberController() {
		return MEMBER_CONTROLLER;
	}

	public MemberDao getMemberDao() {
		return MEMBER_DAO;
	}

	public MemberService getMemberService() {
		return MEMBER_SERVICE;
	}
	
	
	
}
