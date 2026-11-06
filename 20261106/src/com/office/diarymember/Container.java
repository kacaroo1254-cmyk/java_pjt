package com.office.diarymember;

public class Container {
	
	private Session session = new Session();
	final private Dao dao = new Dao();
	final private DiaryService diaryService = new DiaryService();
	final private MemberService memberService = new MemberService(dao, diaryService);
	final private Controller controller = new Controller(memberService);
	
	private static Container container;
	
	private Container() {
		// TODO Auto-generated constructor stub
	}
	
	public static Container getInstance() {
		if (container == null) {
			container = new Container();
		}
		return container;
	}

	public Dao getDao() {
		return dao;
	}

	public MemberService getMemberService() {
		return memberService;
	}

	public DiaryService getDiaryService() {
		return diaryService;
	}

	public Controller getController() {
		return controller;
	}

	public static Container getContainer() {
		return container;
	}
	
	
	
}
