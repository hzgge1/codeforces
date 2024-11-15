import java.util.Scanner;

public class CPlusEquals1368A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		while(lines-- > 0) {
			int a = sc.nextInt(), b = sc.nextInt();
			final int n = sc.nextInt();
			int count = 0;
			while(a<=n && b<=n) {
				if(a>=b) {
					b+=a;
				}else {
					a+=b;
				}
				count++;
			}
			System.out.println(count);
		}
		sc.close();
	}

}
