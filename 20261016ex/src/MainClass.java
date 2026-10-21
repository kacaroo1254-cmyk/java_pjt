import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * 데이터 타입
		 * 메모리에 저장할 데이터의 종류에 따라 할당 받는 메모리 크기가 다르게되는데요.
		 * 각각의 메모리 크기에 따라 데이터 종류를 구분하는 것을 말합니다.
		 * 
		 * 메모리 단위
		 * 1bit 메모리 최소단위
		 * 8bit = 1byte
		 * 1024byte = 1KB
		 * 1024KB = 1MB
		 * 1024MB = 1GB
		 * 1024GB = 1TB
		 * 오버플로우, 언더플로우 
		 */
		
		// 정수 데이터 타입
		/*
		 * byte 		1byte		-128~127
		 * short		2byte		-32,768~32,767
		 * int			4byte		
		 * long			8byte
		 */
		
		byte byteNum = 115;
		System.out.println("byteNum: " + byteNum);
		
		byte byteNum01 = -128;
		System.out.println("byteNum01: " + byteNum01); 		// -128
		
		byteNum01 = (byte)(byteNum01 - 1);
		System.out.println("byteNum01: " + byteNum01);		// -127  (언더플로우 발생)
		
		short shortNum = 22768;
		System.out.println("shortNum: " + shortNum);
		
		int intNum = 1147483648;
		System.out.println("intNum: " + intNum);
		
		int intNum01 = -2147483648;
		System.out.println("intNum01: " + intNum01);		// -2147483648
		
		intNum01 = intNum01 - 1;
		System.out.println("intNum01: " + intNum01);		//  2147483647	(언더플로우 발생)
		
		long longNum = 7223372036854775808L;
		System.out.println("longNum: " + longNum);
		
		System.out.println("byte 최솟값: " + Byte.MIN_VALUE);
		System.out.println("byte 최댓값: " + Byte.MAX_VALUE);
		
		System.out.println("short 최솟값: " + Short.MIN_VALUE);
		System.out.println("short 최댓값: " + Short.MAX_VALUE);
		
		System.out.println("int 최솟값: " + Integer.MIN_VALUE);
		System.out.println("int 최댓값: " + Integer.MAX_VALUE);
		
		System.out.println("long 최솟값: " + Long.MIN_VALUE);
		System.out.println("long 최댓값: " + Long.MAX_VALUE);
		
		// 실수(부동소수점)
		/*
		 * float		4byte
		 * double		8byte
		 */
		
		float floatNum = 3.14f;
		System.out.println("floatNum: " + floatNum);
		
		double doubleNum = 3.14159265358979;
		System.out.println("doubleNum: " + doubleNum);
		
		System.out.println("float 최솟값: " + Float.MIN_VALUE);
		System.out.println("float 최댓값: " + Float.MAX_VALUE);
		
		// 1.4E - 45 = 1.4 / 10의 45승 
		// 3.4028235E38 = 
		
		System.out.println("double 최솟값: " + Double.MIN_VALUE);
		System.out.println("double 최댓값: " + Double.MAX_VALUE);
		
		// 웹에서는 double(좀 더 정밀) 하지만 인베디드에서는 float를 더 많이 사용함(최적화 이슈)

		float num1 = 3.14159265358979323846264338327950288f;
	    double num2 = 3.14159265358979323846264338327950288d;
	    
	    System.out.println("num1: " + num1);
	    System.out.println("num2: " + num2);
	    
	    // 논리 데이터 타입
	    // 참(true), 거짓(false)
	    // bollean 		1byte		true, false
	    boolean flag =true;
	    System.out.println("flag: " + flag);
	    
	    // 문자와 문자열 데이터 타입
	    // 문자
	    /*
	     * 메모리에 문자 데이터를 저장하기 위해서 사용하는 데이터 타입
	     * char 		2byte
	     */
		char ch = 'a';		// 문자는 반드시 ''사용 ""는 사용x
		System.out.println("ch: " + ch);
		
		ch = 'b';
		System.out.println("ch: " + ch);
		
		// ch = 'hello'; 	에러발생
		
		// 빈문자(empty) vs 공백문자(space)
		// char char1 = '';		// 에러(문자는 반드시 하나는 있어야함)
//		char char2 = ' ';		// 공백이 있기때문에 가능
//		System.out.println("char2: " + char2);
		
		// 문자는 메모리에 저장 될 때 정수(유니코드)로 저장이 된다.]
		char char1 = 'A';
		System.out.println("char1: " + char1); 			// A
		
		int unicode = char1;
		System.out.println("unicode: " + unicode);		// 65
		
		char char2 = 'ㄱ';
		System.out.println("char2: " + char2);			// ㄱ
		
		unicode = char2;
		System.out.println("unicode: " + unicode);		// 12593
		
		char char3 = 65;
		System.out.println("char3: " + char3);			// A
		
		char3 = 12593;
		System.out.println("char3: " + char3);			// ㄱ
		
		// 문자열
		// String
		/*
		 * byte, short, int, float, double, char과 다르게 대문자 시작(하나의 클래스이기 때문에)
		 */
		String str1 = "Hello";
		System.out.println("str1: " + str1);
		
		/*
		 * str1 = "";		가능
		 * str2 = " ";		가능
		 */
		
		// 콘솔을 이용한 데이터 입력, 출력
		// 데이터 출력
//		System.out.println(); 		// ln은 line의 약자 출력하고 한줄 개행(\n)
		System.out.print("hello python");
		System.out.println("hello java");
		
		String str = "hello~";
		System.out.println(str);
		
		/*
		 * 특수문자 정리
		 * \n : 개행(줄바꿈)
		 * \t : tab(4칸 공백)
		 * \' : 작은 따옴표(')
		 * \" : 큰 따옴표(")
		 * \\ : 역 슬래쉬(\)
		 */
		
		System.out.print("이름\t학번\n");
		System.out.println("Mr. H\t2020_000123");
		System.out.println("Mr. K\t2020_000124");
		
		System.out.println("어머님께서는 \"밥 먹고 설거지 해놔라.\"라고 하셨습니다.");
		System.out.println("그래서 나는 \'네.\'라고 했습니다.");
		
		System.out.println("\\\\");
		System.out.println("\\\\\\2020-08-01\\\\\\");
		
		// 데이터 입력
		Scanner scanner = new Scanner(System.in);		// 입력받는 역할
		
//		String inputStr = scanner.nextLine();
//		System.out.println("inputStr: " + inputStr);
		
		/*
		 * nextByte() 	:	정수 입력
		 * nextInt()	: 	정수 입력
		 * nextLong()	: 	정수 입력
		 * nextFloat()	:	실수 입력
		 * nextDouble()	:	실수 입력
		 * nextLine()	:	문자열 입력
		 * nextBoolean():	논리 입력
		 */
		
		System.out.println("숫자를 입력하세요.");
		int inputInt = scanner.nextInt();
		System.out.println("inputInt: " + inputInt);
		
//		scanner.nextLine(); // -> \n (개행) 을 int로는 못읽어서 가비지데이터를 날리기위해 추가
		
		System.out.println("문자를 입력하세요.");
		String inputString = scanner.nextLine();
		System.out.println("inputString: " + inputString);
		
		System.out.println("문자2를 입력하세요.");
		String inputString2 = scanner.next();					// next와 nextLine의 차이는 next는 공백이 생기면 그대로 그만 읽음 nextLine은 개행까지 다읽음
		System.out.println("inputString2: " + inputString2);
		
		scanner.close();		// 연결을 끊어줘야함 (입력대기가 무한히 될 수 있기때문에 무한히되면 메모리를 잡고있어서 다음 동작불가) 한번끊으면 다시 연결 불가......
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
