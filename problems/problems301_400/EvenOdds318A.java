import java.math.BigDecimal;
import java.util.Scanner;

public class EvenOdds318A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble(), k = sc.nextDouble(), result = 0;
		if(n>Math.pow(10, 12) || k>n || k<1) return;
		double d = Math.ceil(n/2);
		if(k<=d) result = 2*k-1;
		else result = (k-Math.ceil(n/2))*2;
		System.out.println((new BigDecimal(result).toString()));
		sc.close();
	}

}
