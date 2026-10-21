import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {

//		// for문 	: 횟수에 의한 반복 실행
//		// while문 	: 조건에 의한 반복 실행
//		
//		// for (초기값; 조건식; 단계)
//		// for (시작; 끝; 단계)
//		
//		// 안녕하세요. 를 5회 출력하자!
//		for (int i = 1; i < 6; i++) {
//			System.out.println("안녕하세요.");
//		}
//		
//		int i = 1;
//		for (; i < 6; i++) {
//			System.out.println("hello");
//		}
//		// 이렇게 해도됨 for문 안에 있으면 i는 지역변수 밖에있으면 전역변수가 됨
//		
//		int j = 0;
//		for (j = 5; j < 10; j++) {
//			System.out.println("hhhhhh");
//		}
//		
//		for (int k = 0; k <10; ++k) {
//			System.out.println("O");
//		}
		
		// 1부터 사용자가 입력한 정수까지의 합을 구하는 프로그램을 만들어 보자.
		Scanner scanner = new Scanner(System.in);
//		System.out.println("정수 입력하세요.");
//		int inputData = scanner.nextInt();
//		
//		int sum = 0;
//		
//		for (int i = 1; i <= inputData; i++) {
//			sum += i;
//		}
//		
//		System.out.println("sum: " + sum);
		
		// 3단 구구단 출력
//		for (int i = 1; i < 10; i++) {
////			System.out.println("3 * " + i + " = " + (3 * i));
//			System.out.printf("3 * %d = %d%n", i, (3 * i));
//			System.out.println(String.format("3 * %d = %d", i, (3 * i)));
//		}
//		
		
		// 전체 구구단 (세로 모드)
//		for (int i = 1; i < 10; i++) {
//			for (int j = 1; j < 10; j++) {
//				System.out.printf("%d * %d = %d%n", i, j, i*j);
//			}
//		}
		// 전체 구구단 (가로 모드)
		
//		for (int i = 1; i < 10; i++) {
//			int now = i;
//			int last = 0;
//				
//			for (int j = 1; j < 10; j++) {
//				if (now != last) {
//					System.out.println();
//					System.out.printf("%d * %d = %d\t", j, i, i*j);
//					last = now;
//					
//				} else if (now == last) {
//					System.out.printf("%d * %d = %d\t", j, i, i*j);
//				}
//			}
//		}
		
		/* double로 쓰지말자
		for (double d = 0.0; d < 1; d += 0.1)
			System.out.printf("d: %f \n", d);
		*/
		
		// **********************************************************
		// 중첩 for문을 이용할 때 절대 3단계 이상을 사용하지 말자!
		
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		
//		for (int i = 0; i <= 5; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 0; j <= 5 - i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 0; j < 5 - i; j++) {
//				System.out.print(" ");
//			}
//			
//			for (int k = 0; k < i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		// n층짜리 트리만들기
//		
//		System.out.println("월\t화\t수\t목\t금\t토\t일");
//		int offset = 3;
//		int day = 1;
//		
//		for (int i = 0; i < 5; i++) {
//			// -
//			for (int j = 0; j < offset; j++) {
//				System.out.print(String.format("%3c\t", '-'));
//			}
//			//날짜
//			for (int j = 0; j < 7 - offset; j++) {
//				if (day <= 30) {
//				System.out.print(String.format("%3d\t", day));
//				day++;
//				} else {
//					System.out.print(String.format("%3c\t", '-'));
//				}
//			}
//			offset = 0;
//			System.out.println();
//			
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * while문
		 * 조건에 의한 반복
		 * while (조건식) {
		 * 	 실행문
		 * }
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scanner.close();
		

	}

}
