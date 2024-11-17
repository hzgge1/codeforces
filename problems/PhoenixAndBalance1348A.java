import java.util.Scanner;

public class PhoenixAndBalance1348A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		while(lines-- > 0) {
			int n = sc.nextInt();
			int pile1 = 1<<n , pile2 = 0;
			for (int i = 1; i < n/2; i++) {
				pile1 += 1<<i;
			}
			for (int i = n/2; i < n; i++) {
				pile2 += 1<<i;
			}
			System.out.println(Math.abs(pile1-pile2));
		}
		sc.close();
	}

}
