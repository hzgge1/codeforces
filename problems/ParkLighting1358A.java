import java.util.Scanner;

public class ParkLighting1358A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		while(lines-- > 0) {
			int n = sc.nextInt() , m = sc.nextInt();
			System.out.println(n/2 * m + n%2 * (m/2 + m%2));
		}
		sc.close();
	}

}
