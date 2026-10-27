package com.office.classex01;

public class MainClass {

	public static void main(String[] args) {
		
		Student student1 = new Student(
				"홍길동",
				1,
				20,
				"Computer");
		student1.printInfo();
		
		Student student2 = new Student(
				"박찬호",
				2,
				21,
				"Baseball");
		student2.printInfo();
		
		Student student3 = new Student(
				"박세리",
				3,
				22,
				"Golf");
		student3.printInfo();
		
		// 배열
		/*
		 * 데이터 타입[] 레퍼런스 변수 = {아이템, 아이템, 아이템, ...};
		 */
		
		Student[] students = {student1, student2, student3};
		
		for (int i = 0; i < students.length; i++) {
			students[i].printInfo();
		}
		
		// 전공이 Baseball인 학생의 이름과 나이를 출력하자!
		
		for (int i = 0; i < students.length; i++) {
			if (students[i].major.equals("Baseball")) {
				System.out.println(students[i].name);
				System.out.println(students[i].age);
				break; // 한명을 찾을때 퍼포먼스를 위해서 넣음
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
