package problems1501_2000;
import java.util.Scanner;

public class PolycarpAndCoins1551A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		for (int i = 0; i < lines; i++) {
			int t = sc.nextInt();
			int n = t/3;
			switch(t%3) {
			case 0 : 
				System.out.println(n + " " + n);
				break;
			case 1 :
				System.out.println((n+1) + " " + n);
				break;
			case 2 :
				System.out.println(n + " " + (n+1));
				break;
			default:
				System.out.println("Impossible");
			}
		}
		sc.close();
	}

}
