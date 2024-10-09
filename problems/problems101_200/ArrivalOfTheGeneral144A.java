package problems101_200;
import java.util.Arrays;
import java.util.Scanner;

public class ArrivalOfTheGeneral144A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] v = new int[n],aux = new int[n];
		for(int i=0;i<n;i++) {
			v[i] = sc.nextInt();
			aux[i] = v[i];
		}
		Arrays.sort(aux);
		int max = 0, min = 0, result = 0;
		for(int i:v) {
			if(i!=aux[n-1]) max++;
			else break;
		}
		for(int i=max;i>0;i--) {
			result++;
			int temp = v[i]; v[i] = v[i-1]; v[i-1] = temp;
		}
		for(int i=n-1;i>=0;i--)
			if(v[i]!=aux[0]) min++;
			else break;
//		System.err.println("max="+max+"|min="+min);
		System.out.println(result+min);
		
		
		sc.close();
	}

}
