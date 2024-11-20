package problems1301_1400;
import java.util.Scanner;

public class MostUnstableArray1353A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		while(lines-- > 0) {
			int n = sc.nextInt(), m = sc.nextInt();
			if(n == 1) {
				System.out.println(0);
			}else if(n == 2) {
				System.out.println(m);
			}else {
				System.out.println(2*m);
			}
		}
		sc.close();
	}

}
