package problems1501_2000;
import java.util.Scanner;

public class OddSet1542A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		while (lines-- > 0) {
			int x = sc.nextInt();
			int count = 0;
			for (int i = 0; i < x*2; i++) {
				if (sc.nextInt() % 2 == 0) {
					count++;					
				}
			}
			System.out.println(count == x ? "YES" : "NO");
		}
		sc.close();
	}

}
