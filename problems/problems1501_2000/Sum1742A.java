package problems1501_2000;
import java.util.Scanner;

public class Sum1742A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rep = sc.nextInt();
		for(int i=0;i<rep;i++) {
			int a = sc.nextInt(), b = sc.nextInt(), c =sc.nextInt();
			if(a+b==c || a+c==b || b+c==a) System.out.println("YES");
			else System.out.println("NO");
		}
		sc.close();
	}

}
