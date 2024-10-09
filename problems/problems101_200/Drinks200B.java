package problems101_200;
import java.util.Scanner;

public class Drinks200B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double result = 0;
		for(int i=0;i<n;i++)
			result += sc.nextInt();
		System.out.println(result/n);
		sc.close();
	}

}
