package problems1501_2000;
import java.util.Scanner;

public class MakeItWhite1927A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		while (lines-- > 0) {
			sc.nextLine();
			String s = sc.nextLine();
			s = removeFirstsWhite(s);
			s = removeLastsWhite(s);
			System.out.println(s.length());
		}
		sc.close();
	}

	private static String removeLastsWhite(String s) {
		while (!s.isEmpty() && s.charAt(0) == 'W') {
			s = s.substring(1);
		}
		return s;
	}

	private static String removeFirstsWhite(String s) {
		while (!s.isEmpty() && s.charAt(s.length() - 1) == 'W') {
			s = s.substring(0, s.length() - 1);
		}
		return s;
	}

}
