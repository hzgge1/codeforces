import java.util.Scanner;

public class VusTheCossackAndAContest1186A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
		System.out.println((n<=m && n<=k) ? "YES":"NO");
		sc.close();
	}

}
