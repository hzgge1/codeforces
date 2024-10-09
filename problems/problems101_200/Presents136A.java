package problems101_200;
import java.util.Arrays;
import java.util.Scanner;

public class Presents136A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] v = new int[n];
		for(int i=0;i<n;i++) {
			int index = sc.nextInt();
			v[index-1]=i+1;
		}
		String result = Arrays.toString(v).replace(",", "");
		System.out.println(result.substring(1,result.length()-1));
		sc.close();
	}

}
