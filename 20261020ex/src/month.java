
public class month {

	public static void main(String[] args) {
		System.out.println("월\t화\t수\t목\t금\t토\t일");
		int n = 1;
		int setoff = 3;
		int days = 30;
		int week = 0;
		int changeSetoff = setoff;
		
		while (n <= days) {
			if (changeSetoff > 0) {
				for (int i = 1; i <= setoff; i++) {
					System.out.print("-\t");
					week++;
					changeSetoff--;
				}
			}
			
			if (week <= 7) {
				for (int i = 1; i <= 7; i++) {
					System.out.print(n+"\t");
					n++;
					week++;
				}
			} else {
				System.out.println();
				week = 0;
			}
			
		}

	}

}
