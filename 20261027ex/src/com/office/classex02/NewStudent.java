package com.office.classex02;

public class NewStudent {

	// 멤버 필드
	int grade = 1;				// 학년
	int classNo;			// 반번호
	int studentNo;			// 학생 개인 번호
	String studentName;		// 학생 이름
	boolean absence;		// 휴학구분(true: 휴학, false: 재학)
	
	/*
	 *  생성자 오버로딩이란, 생성자가 과적(넘침)을 했다는 의미입니다.
	 *  파라미터의 갯수와 데이터 타입이 정확히 맞는 생성자로 찾아감
	 *  단 파라미터 갯수와 데이터 타입이 같으면 에러가 남
	 *  결국 둘 중 하나는 달라야 구분이 가능하다는 점
	 */
	
	// 생성자
	public NewStudent() {
		
	}
	
	public NewStudent(int grade, int classNo, int studentNo, String studentName, boolean absence) {
		this.grade = grade;
		this.classNo = classNo;
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.absence = absence;
	}
	
	public NewStudent(int classNo, int studentNo, String studentName, boolean absence) {
		this.classNo = classNo;
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.absence = absence;
	}

	public NewStudent(int classNo, int studentNo, String studentName) {
		this.classNo = classNo;
		this.studentNo = studentNo;
		this.studentName = studentName;
	}

	public NewStudent(int grade, int classNo, int studentNo, String studentName) {
		this.grade = grade;
		this.classNo = classNo;
		this.studentNo = studentNo;
		this.studentName = studentName;
	}

	// 메서드
	public void printInfo() {
		System.out.println("-----------------------------------------------");
		System.out.println("학년: " + grade);
		System.out.println("반번호: " + classNo);
		System.out.println("학생 개인 번호: " + studentNo);
		System.out.println("학생 이름: " + studentName);
		System.out.println("휴학구분: " + absence);
	}

	
	
	
}
