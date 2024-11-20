package problems1401_1500;
import java.util.Scanner;

public class YetAnotherTwoIntegersProblem1409A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rep = sc.nextInt();
		for(int i=0;i<rep;i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			int dif = Math.abs(a-b);
			System.out.println(dif%10==0? dif/10:(dif/10)+1);
		}
		sc.close();
	}

}
