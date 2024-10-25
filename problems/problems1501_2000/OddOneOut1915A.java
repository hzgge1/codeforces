package problems1501_2000;
import java.util.Scanner;

public class OddOneOut1915A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		for(int i=0;i<lines;i++) {
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
			if(a == b) System.out.println(c);
			else if(a == c ) System.out.println(b);
			else System.out.println(a);
		}
		sc.close();
	}

}
