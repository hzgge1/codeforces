package problems1501_2000;
import java.util.Scanner;

public class YESorYES1703A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rep = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<rep;i++) {
			String s = sc.nextLine().toUpperCase();
			System.out.println(s.equals("YES")? "YES":"NO");
		}
		sc.close();
	}

}
