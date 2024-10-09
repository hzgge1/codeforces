package problems101_200;
import java.util.Scanner;

public class StringTask118A {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s = s.toLowerCase();
		s = deletesAllTheVowels(s);
		String[] v = s.split("");
		System.out.println("."+String.join(".", v));
		sc.close();
	}

	private static String deletesAllTheVowels(String s) {
		return s.replace("a", "").replace("o", "").replace("y", "").replace("e", "")
				.replace("u", "").replace("i", "");
	}
	
}
