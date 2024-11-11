package problems1501_2000;
import java.util.Scanner;

public class TenWordsOfWisdom1850B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		while(lines-- > 0) {
			int n = sc.nextInt();
			int index = 0;
			double max = 0;
			for (int i = 0; i < n; i++) {
				double a = sc.nextInt(), b = sc.nextInt();
				if(a <= 10 && b > max) {
					max = b;
					index = i+1;
				}
			}
			System.out.println(index);
		}
		sc.close();
	}

}
