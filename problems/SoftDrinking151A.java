import java.util.Scanner;

public class SoftDrinking151A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt(), l = sc.nextInt(), c = sc.nextInt(),
			d = sc.nextInt(), p = sc.nextInt(), nl = sc.nextInt(), np = sc.nextInt();
		int drink = k * l, limes = c * d;
		System.out.println(Math.min((drink/(n*nl)), Math.min(limes/n, p/(n*np))));
		sc.close();
	}

}
