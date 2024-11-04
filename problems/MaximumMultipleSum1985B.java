import java.util.Scanner;

public class MaximumMultipleSum1985B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		for (int i = 0; i < lines; i++) {
			function(sc.nextInt());
		}
		sc.close();
	}

	private static void function(int n) {
		int max = 0, result = 2;
		for (int i = 2; i <= n; i++) {
			int x = maltipleSumOf(i,n);
			if(x>max) {
				result = i;
				max = x;
			}
		}
		System.out.println(result);

	}

	private static int maltipleSumOf(int i, int n) {
		int sum = 0;
		int multiple = 1;
		while(multiple*i<=n) {
			sum += multiple*i;
			multiple++;
		}
		return sum;
	}

}
