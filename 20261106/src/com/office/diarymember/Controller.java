package com.office.diarymember;

import java.util.Scanner;

public class Controller implements Config {

	final private MemberService memberService;
	
	public Controller(MemberService memberService) {
		this.memberService = memberService;
	}
	
	public void execute() {
		Scanner scanner = new Scanner(System.in);
		
		boolean systemFlag = true;
		
		String memId;
		String memPw;
		String memMail;
		String memPhone;
		MemberDto memberDto;
		DiaryService diaryService;
		
		while (systemFlag) {
			System.out.println("1.회원가입    2.로그인    3.정보수정    4.다이어리    5.탈퇴    99.종료");
			int seletedMenu = scanner.nextInt();
			
			switch (seletedMenu) {
			case SIGN_UP:
				
				System.out.println("새로운 아이디를 입력하세요.");
				memId = scanner.next();
				
				System.out.println("새로운 비밀번호를 입력하세요.");
				memPw = scanner.next();
				
				System.out.println("이메일을 입력하세요.");
				memMail = scanner.next();
				
				System.out.println("전화번호를 입력하세요.");
				memPhone = scanner.next();
				
				memberDto = new MemberDto(memId, memPw, memMail, memPhone);
				
				memberService.signUp(memberDto);
				
				break;
			case SIGN_IN:
				
				System.out.println("아이디를 입력하세요.");
				memId = scanner.next();
				
				System.out.println("비밀번호를 입력하세요.");
				memPw = scanner.next();
				
				memberDto = new MemberDto(memId, memPw, null, null);
				
				memberService.signIn(memberDto);
				
				break;
			case MODIFY:
				
				System.out.println("아이디를 입력하세요.");
				memId = scanner.next();
				
				System.out.println("본인 확인을 위한 비밀번호를 입력하세요.");
				memPw = scanner.next();

				memberDto = new MemberDto(memId, memPw, null, null);
				
				boolean isAuthentication = memberService.doAuthenticationByMemIdAndMemPw(memberDto);
				
				if (isAuthentication) {
					System.out.println("변경할 비밀번호를 입력하세요.");
					memPw = scanner.next();
					
					System.out.println("변경할 이메일을 입력하세요.");
					memMail = scanner.next();
					
					System.out.println("변경할 전화번호를 입력하세요.");
					memPhone = scanner.next();
					
					memberDto.setMemPw(memPw);
					memberDto.setMemMail(memMail);
					memberDto.setMemPhone(memPhone);
					
					memberService.modify(memberDto);
				}

				break;
			case DIARY:
				System.out.println("1.쓰기    2.읽기");
				int seletedDiaryMenu = scanner.nextInt();
				
				if (seletedDiaryMenu == 1) {
					diaryService.write();
				}
				
				break;
			case DELETE:
				
				System.out.println("아이디를 입력하세요.");
				memId = scanner.next();
				
				System.out.println("본인 확인을 위한 비밀번호를 입력하세요.");
				memPw = scanner.next();
				
				memberDto = new MemberDto(memId, memPw, null, null);
				
				memberService.delete(memberDto);
				
				break;
			case SYSTEM_OUT:
				
				systemFlag = false;
				System.out.println("Good bye~");
				
				break;
			}
		}
		
		scanner.close();
		
	}

}
