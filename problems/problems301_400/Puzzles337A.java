import java.util.Arrays;
import java.util.Scanner;

public class Puzzles337A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int[] v = new int[m];
		for(int i=0;i<m;i++)
			v[i] = sc.nextInt();
		Arrays.sort(v);
		int min = v[n-1]-v[0];
		for(int i=1; i<m+1-n ; i++) 
			if(v[i+n-1]-v[i]<min) min = v[i+n-1]-v[i];
		System.out.println(min);
		
		sc.close();
	}

}
