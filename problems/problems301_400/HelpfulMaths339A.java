package problems301_400;
import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths339A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if(s.length()>100) return;
		String[] v = s.split("\\+");
		System.out.println(sort(v));
		sc.close();
	}

	private static String sort(String[] v) {
		Arrays.sort(v);
		String s = Arrays.toString(v).replace(",", "+").replace(" ","");
		return s.substring(1, s.length()-1);
	}
	
	

}
