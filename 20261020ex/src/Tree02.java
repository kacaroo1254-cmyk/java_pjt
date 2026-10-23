import java.util.Scanner;

public class Tree02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		// 모래시계만들어보기
		int n = input.nextInt();
		String star = "*";
		int direction = -1;
		int tempN = n;
		int minN;
		
		if (n % 2 ==0) {
			minN = 2;
		} else {
			minN = 1;
		}
		
		do  {
			for (int i = 1; i <= (n-tempN)/2; i++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= tempN; i++) {
				System.out.print(star);
			}
			System.out.println();
			if (tempN == minN) {
				direction = 1;			
			}
			tempN += 2*direction;			
		} while (tempN <= n);
		
		input.close();
	}

}
