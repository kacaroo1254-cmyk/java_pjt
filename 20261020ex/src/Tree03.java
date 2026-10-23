import java.util.Scanner;

public class Tree03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 모래시계 만들기
        int n = input.nextInt();
        String star = "*";

        int direction = -1;  // -1: 별 감소, 1: 별 증가
        int tempN = n;       // 현재 줄의 별 개수
        int minN;            // 최소 별 개수

        // 홀수와 짝수에 따라 최소 별 개수 설정
        if (n % 2 == 0) {
            minN = 2;
        } else {
            minN = 1;
        }

        do {
            // 공백 출력
            for (int i = 0; i < (n - tempN) / 2; i++) {
                System.out.print(" ");
            }

            // 별 출력
            for (int i = 0; i < tempN; i++) {
                System.out.print(star);
            }
            System.out.println();

            // 최소 별 개수에 도달하면 방향 전환
            if (tempN == minN) {
                direction = 1;
            }

            // 다음 줄의 별 개수 계산
            tempN += 2 * direction;

        } while (tempN <= n);

        input.close();
    }
}