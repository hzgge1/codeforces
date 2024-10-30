import java.util.Scanner;

public class ArrayColoring1857A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		for (int i = 0; i < lines; i++) {
			int sum = 0;
			int n = sc.nextInt();
			for (int j = 0; j < n; j++) {
				sum += sc.nextInt();
			}
			System.out.println(sum%2==0 ? "YES":"NO");
		}
		sc.close();
	}

}
