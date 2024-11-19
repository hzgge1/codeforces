package problems1501_2000;
import java.util.Scanner;

public class CasimirsStringSolitaire1579A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		while(lines-- > 0) {
			String s = sc.nextLine();
			System.out.println(s.length()-s.replace("B", "").length() == s.replace("B", "").length() ? "YES":"NO");
		}
		sc.close();
	}

}
