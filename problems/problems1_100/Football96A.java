package problems1_100;
import java.util.Scanner;

public class Football96A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] v = sc.nextLine().split("");
		int n = 1;
		String c = v[0];
		for(int i=1;i<v.length;i++) {
			if(v[i].contains(c)) n++;
			else {
				n=1;
				c = v[i];
			}
			if(n>=7) {
				System.out.println("YES");
				sc.close();
				return;
			}
		}
		System.out.println("NO");
		sc.close();
	}

}
