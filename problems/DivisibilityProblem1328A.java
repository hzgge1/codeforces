import java.util.Scanner;

public class DivisibilityProblem1328A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			int result = a%b;
			System.out.println(result==0?0:b-result);
		}
		sc.close();
	}

}
