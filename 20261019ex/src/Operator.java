
public class Operator {

	public static void main(String[] args) {

		/*
		 * 연산자(Operator)
		 * 산술연산자, 대입(복합) 연산자, 비교 연산자, 논리 연산자, 조건식 연산자 등등...
		 */
		
		/*
	         산술 연산자   +, -, *, /, %, ++, --
	         할당 연산자   =, +=, -=, *=, /=, %=, &=, |=
	         비교 연산자   ==, !=, >, <, >=, <=
	         논리 연산자   &&, ||, !
	    */
		
		
		// 1. 덧셈 연산
		// 1-1. 숫자 덧셈
		int num1 = 10;
		int num2 = 20;
		System.out.println("num1 + num2: " + (num1 + num2));
		
		float num3 = 0.1f;
		float num4 = 0.2f;
		System.out.println("num3 + num4: " + (num3 + num4));
		
		// 1-2. 문자열 덧셈(연결 연산자)
		String str1 = "Hello ";
		String str2 = "world";
		System.out.println("str1 + str2: " + (str1 + str2));
		
		// 1-3. 숫자 + 문자열 = 문자열 + 문자열 처리 = 문자열(연결 연산자)
		System.out.println(10 + "Hello");
		System.out.println(3.14f + "Hello");
		
		// 참고 문자 덧셈
		System.out.println('A' + 'B'); 			// 131 (유니코드화 되어서 연산 65 + 66 = 131)
		System.out.println('가' + '나'); 		// 44032 + 45208 = 89240
		
		// 2. 뺄셈
		// 2-1. 숫자 뺄셈
		num1 = 10;
		num2 = 20;
		System.out.println("num1 - num2: " + (num1 - num2));
		
		num3 = 0.1f;
		num4 = 0.2f;
		System.out.println("num3 - num4: " + (num3 - num4));
		
		// 2-2. 문자열 뺄셈(X)
		str1 = "Hello";
		str2 = "world";
//		System.out.println("str1 - str2: " + (str1 - str2));		// 에러
		
		// 참고 (문자 뺄셈은 가능 유니코드로 변환되기때문)
		System.out.println('A' - 'B'); 			
		System.out.println('가' - '나'); 
		
		
		// 3. 곱셈
		num1 = 10;
		num2 = 20;
		System.out.println("num1 * num2: " + (num1 * num2));
		
		num3 = 0.1f;
		num4 = 0.2f;
		System.out.println("num3 * num4: " + (num3 * num4));
		
		// 참고
		System.out.println('A' * 'B'); 			
		System.out.println('가' * '나'); 
		
		
		// 4. 나눗셈
		num1 = 10;
		num2 = 20;
		System.out.println("num1 / num2: " + (num1 / num2));		// 0.5 인데 오버플로우가 나서 0으로 표기
		System.out.println("num1 / num2: " + ((float)num1 / num2));	// 둘 중 하나를 8byte로 변환해서 계산하자
		
		num3 = 0.8f;
		num4 = 0.2f;
		System.out.println("num3 / num4: " + (num3 / num4));		// 4.0 메모리공간때문에
		
		// 참고
		System.out.println((int)'a'); 				// 97
		System.out.println((int)'A'); 				// 65
		System.out.println('a' / 'A'); 				// 97 / 65 ==> 1.492307692307692	
		
		System.out.println(0/100); 			// 0
//		System.out.println(100/0); 			// 수학적으로 불가능
		
		
		// 5. 나머지 연산자
		num1 = 10;
		num2 = 3;
		System.out.println("num1 % num2: " + (num1 % num2));
		System.out.println('a' % 'A');		// 32
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
