package problems901_1000;
import java.util.Scanner;

public class WrongSubtraction977A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		for(int i=0;i<k;i++) {
			if(n%10==0) n /= 10;
			else n--;
		}
		System.out.println(n);
		sc.close();
	}

}
