package problems1_100;
import java.util.Scanner;

public class UltraFastMathematician61A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String result = "", line1 = sc.nextLine(), line2 = sc.nextLine();
		for (int i = 0; i < line1.length(); i++) {
			if (line1.charAt(i) == line2.charAt(i))
				result += "0";
			else
				result += "1";
		}
		System.out.println(result);
		sc.close();
	}
}
