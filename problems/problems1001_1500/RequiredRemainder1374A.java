package problems1001_1500;
import java.util.Scanner;

public class RequiredRemainder1374A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		for(int i=0;i<lines;i++) {
			int x = sc.nextInt(), y = sc.nextInt(), n = sc.nextInt();
			System.out.println((n%x>=y)? (n/x)*x+y:(n/x-1)*x+y);
		}
		sc.close();
	}

}
