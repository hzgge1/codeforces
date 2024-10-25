package problems1001_1500;
import java.util.Scanner;

public class ShortSubstrings1367A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		for(int i=0;i<lines;i++) {
			function(sc.nextLine());
		}
		sc.close();
	}

	public static void function(String s) {
		if(s.length() == 2) System.out.println(s);
		else {
			String result = s.substring(0, 2);
			for(int i=3;i<s.length();i+=2) {
				result += s.charAt(i);
			}			
			System.out.println(result);
		}
		
	}
	
}
