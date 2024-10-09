package problems101_200;
import java.util.Scanner;

public class Tram116A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), max = 0 , total = 0;
		for(int i=0;i<n;i++) {
			total -= sc.nextInt();
			total += sc.nextInt();
			if(total>max) max = total;
		}
		System.out.println(max);
		sc.close();
	}

}
