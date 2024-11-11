package problems1501_2000;
import java.util.Scanner;

public class YogurtSale1955A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		while(lines-- > 0) {
			int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
			if(a*2 <= b) {
				System.out.println(n*a);
			}else {
				System.out.println(n/2*b + n%2*a);
			}
		}
		sc.close();
	}

}
