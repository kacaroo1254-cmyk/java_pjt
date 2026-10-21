
public class LoopEx02 {

	public static void main(String[] args) {
		
		/*
		 * 반복 흐름 제어
		 * break, continue
		 * 
		 * 
		 * break: 프로그램 실행중 break를 만나면 즉시 중단
		 * continue: 반복 실행 시 continue를 만나면 다음 반복으로 넘어감
		 * 
		 */
		
		// 1~10 까지의 정수의 합을 구하되, 합이 30이 넘으면 중단
//		int sum =0;
//		for (int i = 1; i <= 10; i++) {
//			sum += i;
//			if(sum > 30)
//				break;
//		}
//		System.out.println("sum: "+sum);
		
		// 1부터 10까지의 정수를 출력하되, 짝수만 출력한다.
//		for (int i = 0; i <= 10; i++) {
//			if (i % 2 != 0)
//				continue;
//			System.out.println("i: "+i);
//		}
		
		/*
		 * 반복문 이름 부여하기
		 * 지금까지 반복문의 다양한 기능에 대해서 살펴봤는데요, 마지막으로 반복문에 이름을 부여하는 것에 대해서 살펴보겠습니다. 
		 * 반복문에 이름을 부여한다는 것은 for문 또는 while문에 명찰(Label)을 달아주는 것이라고 생각하면 됩니다. 그리고 명찰뒤에 콜론(:)을 붙여 줍니다.
		 */
		
		/*
		 * 요구사항
		 * 1. 구구단을 출력하시오.
		 * 2. 구구단을 출력할 때 짝수 곱셈은 생략하시오.
		 * 3. 모든 구구단 곱셈 결과값을 덧셈하고, 합이 200을 초과하면 출력을 중단하시오.
		 */
		
		int sum = 0;
		
		for (int i = 2; i < 10; i++) {
			
			for (int k = 1; k < 10; k++) {
				if (k % 2 == 0)
					continue;
				sum += i * k;
				if (sum > 200)
					break;
				System.out.printf("%d * %d = %d \n", i, k, sum);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
