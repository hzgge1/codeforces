import java.util.Arrays;
import java.util.Scanner;

public class Twins160A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt() , total = 0;
		int[] v = new int[n];
		for(int i=0;i<n;i++) {
			v[i] = sc.nextInt();
			total += v[i];
		}
		Arrays.sort(v);
		int result = 0, aux = 0;
		for(int i=n-1;i>=0;i--) {
			result++;
			aux += v[i];
			if(aux > total-aux) break;
		}
		System.out.println(result);
		sc.close();
	}
}
