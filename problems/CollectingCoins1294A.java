import java.util.Scanner;

public class CollectingCoins1294A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		for (int i = 0; i< lines;i++) {
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), n = sc.nextInt();
			System.err.println(a+" "+b+" "+c+" "+n);
			System.out.println((a+b+c+n)%3==0?"YES":"NO"); 
		}
		sc.close();
	}
}
