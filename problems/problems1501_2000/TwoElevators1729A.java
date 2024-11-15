package problems1501_2000;
import java.util.Scanner;

public class TwoElevators1729A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		while(lines-- > 0) {
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
			if(a==1) {
				System.out.println(1);
			}else {
				int aTo1 = a-1;
				int bTo1 = Math.abs(b-c) + c-1;
				if(aTo1 < bTo1)
					System.out.println(1);
				else if(aTo1 > bTo1)
					System.out.println(2);
				else
					System.out.println(3);
			}
		}
		sc.close();
	}

}
