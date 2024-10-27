package problems1_100;
import java.math.BigDecimal;
import java.util.Scanner;

public class TheatreSquare1A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextInt();
		double m = sc.nextInt();
		double a = sc.nextInt();
		double result = Math.ceil(n/a)*Math.ceil(m/a);
		System.out.println(new BigDecimal(result));
		sc.close();
	}

}
