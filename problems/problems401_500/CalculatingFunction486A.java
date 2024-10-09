package problems401_500;
import java.math.BigDecimal;
import java.util.Scanner;

public class CalculatingFunction486A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		double d = Double.parseDouble(n);
		if(d<1 || d>Math.pow(10, 15)) return;
		if(d%2!=0) d = -1*Math.ceil(d/2);
		else d = Math.ceil(d/2);
		String result = (new BigDecimal(d)).toString();
		System.out.println(result);
		sc.close();
	}

}
