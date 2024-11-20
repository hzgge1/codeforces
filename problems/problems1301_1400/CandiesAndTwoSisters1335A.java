package problems1301_1400;
import java.util.Scanner;

public class CandiesAndTwoSisters1335A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int total = sc.nextInt();
			if(total<=2) System.out.println(0);
			else 
				System.out.println((total-1)/2);
		}
		sc.close();
	}

}
