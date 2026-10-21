import java.util.Scanner;

public class LoopEx01 {

	public static void main(String[] args) {
		
		/*
		 * while문 : 조건에 의한 반복 (무한루프 조심)
		 * while(조건식) {
		 *   실행문
		 * }
		 */
		
//		int i = 0;
//		while (i < 5) {
//			System.out.println("Hello");
//			i++;
//		}
		
//		int i = 0;
//		boolean flag = true;
//		
//		while (flag) {
//			System.out.println("i : " +  i);
//			i++;
//			if (i > 100)
//				flag = false;
//		}
		
		// do ~ while문
//		int i = 1;
//		int sum = 0;
//		
//		do {
//			sum += i;
//			i++;
//		} while (i <= 10);
//		
//		System.out.println("sum: " + sum);
		
		Scanner scanner = new Scanner(System.in);
		
		int condition = 0;
		
		do {
			System.out.println("우유를 배송한다.");
			System.out.println("정기 배송 진행 여부를 선택한다.");
			
			System.out.println("1. 맛있다.    2. 맛없다.");
			condition = scanner.nextInt();
			
			if (condition == 2) {
				System.out.println("그만 배송 하세요.");
			}
			
		} while(condition == 1);
		
		
		
		
		scanner.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
