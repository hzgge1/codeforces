package problems1001_1100;
import java.util.Scanner;

public class InSearchOfAnEasyProblem1030A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
			if(sc.nextInt()==1) {
				System.out.println("HARD");
				return;
			}
		System.out.println("EASY");
		sc.close();
	}
}
