package problems701_800;
import java.util.Scanner;

public class BachgoldProblem749A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(n/2);
		if(n%2==1) {
			for (int i = 0; i < n/2-1; i++) {
				System.out.print(2+" ");
			}
			System.out.println(3);
		}else {
			for (int i = 0; i < n/2; i++) {
				System.out.print(2+" ");
			}
		}
		sc.close();

	}

}
