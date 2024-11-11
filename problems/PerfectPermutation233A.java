import java.util.Scanner;

public class PerfectPermutation233A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%2 != 0) {
			System.out.println(-1);
		}else {
			for (int i = 1; i <= n; i++) 
				System.out.print(i%2==0 ? i-1+" " : i+1+" ");
		}
		sc.close();
	}

}
