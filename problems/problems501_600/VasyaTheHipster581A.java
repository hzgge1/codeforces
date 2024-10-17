package problems501_600;
import java.util.Scanner;

public class VasyaTheHipster581A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt();
		System.out.println(Math.min(a, b)+" "+Math.abs(a-b)/2);
		sc.close();
	}

}
