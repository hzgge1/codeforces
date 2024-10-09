package problems201_300;
import java.util.Scanner;

public class StonesOnTheTable266A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] v = sc.nextLine().split("");
		String result = v[0];
		String c = v[0];
		for(int i=1;i<n;i++) {
			if(!c.contains(v[i])) {
				c = v[i];
				result += c;
			}
		}
		System.out.println(n-result.length());
		sc.close();
	}

}
