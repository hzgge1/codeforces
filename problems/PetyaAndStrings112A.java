import java.util.Scanner;

public class PetyaAndStrings112A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1,s2;
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		if(s1.length() != s2.length()) {
			System.err.println("They are not of the same length");
			return;
		}else
			System.out.println(compare(s1.toLowerCase(),s2.toLowerCase()));
		sc.close();
	}

	private static int compare(String s1, String s2) {
		int n = s1.compareTo(s2);
		if(n<0) n = -1;
		else if(n>0) n = 1;
		return n;
	}

}
