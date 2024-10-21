import java.util.Scanner;

public class ToMyCritics1850A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		for (int i = 0; i < lines; i++) {
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
			System.out.println((a + b >= 10 || a + c >= 10 || b + c >= 10) ? "YES" : "NO");
		}
		sc.close();
	}
}
