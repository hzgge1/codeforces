package problems901_1000;
import java.util.Scanner;

public class FafaAndHisCompany935A {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i < n; i++) {
			if(n%i == 0) count++;
		}
		System.out.println(count);
		sc.close();
	}
}
