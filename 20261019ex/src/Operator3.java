
public class Operator3 {

	public static void main(String[] args) {
		
		/*
		 * 비교 연산자
		 * 크고 작음을 나타내는 연산자 입니다.
		 */
		
		System.out.println(10 < 20); 		// true
		System.out.println(10 > 20); 		// false
		
		System.out.println(10 <= 20); 		// true
		System.out.println(10 >= 20); 		// false
		
		System.out.println(10 == 20); 		// false
		System.out.println(10 != 20); 		// true
		
		float num5 = 0.1f;
		double num6 = 0.1;

		System.out.println("num5: " + num5);
		System.out.println("num6: " + num6);
		System.out.println("num5 + num6: " + (num5 + num6));
		
		System.out.println("num5 == num6: " + (num5 == num6)); 		// false
		System.out.println("num5 != num6: " + (num5 != num6));  	// true
		
		System.out.println("num5 > num6: " + (num5 > num6));
		System.out.println("num5 < num6: " + (num5 < num6));
		
		int num7 = 10;
		float num8 = 10.0f;
		System.out.println("num7 > num8: " + (num7 > num8));		// false
		System.out.println("num7 >= num8: " + (num7 >= num8));		// true
		System.out.println("num7 < num8: " + (num7 < num8));		// false
		System.out.println("num7 <= num8: " + (num7 <= num8));		// true
		System.out.println("num7 == num8: " + (num7 == num8));		// true
		System.out.println("num7 != num8: " + (num7 != num8));		// false
		// int와 float 타입이 연산되면 int가 float로 형 변환 하기 때문에 int => float되어 10.0f로 바뀌기 때문
		// float와 double은 자동변형후 연산되지만 float 0.1f는 0.10000000149가 > double로 변하기 때문에 위의 결과가 나온다
		
		
		// *******************************************************************
		// 문자열 비교
		String str1 = "hello";
		String str2 = "hello";
		
		System.out.println("str1 == str2: " + (str1 == str2)); 			// true
		
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		
		System.out.println("str3 == str4: " + (str3 == str4)); 			// false
		
		System.out.println(str3.equals(str4)); 							// true 문자열 비교를 할 때는 반드시 .equals 을 사용하자
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
