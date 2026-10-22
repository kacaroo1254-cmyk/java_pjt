import java.util.Scanner;

public class Tree02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// 모래시계만들어보기
		int n = input.nextInt();
		int derection = 1;
		while (n<=0) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(' ');
			}
			for (int j = 1; j <= 2*i-1; j++) {
				System.out.print('*');
			}
			for (int j = 1; j <= n-i; j++) {
				System.out.print(' ');
			}
			System.out.println();
			n--;
		}
		
		input.close();

	}

}
