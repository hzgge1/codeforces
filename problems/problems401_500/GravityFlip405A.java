package problems401_500;
import java.util.Arrays;
import java.util.Scanner;

public class GravityFlip405A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] result = new int[n];
		for(int i=0;i<n;i++) {
			int aux = sc.nextInt();
			for(int j=n-1;j>=0;j--) {
				if(aux>result[j]) {
					int temp = result[j]; result[j] = aux; aux = temp; 
				}
			}
		}
		String s = Arrays.toString(result).replace(",", "");
		System.out.println(s.substring(1,s.length()-1));
		sc.close();
	}
}
