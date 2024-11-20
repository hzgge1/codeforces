import java.util.Scanner;

public class PolycarpAndTheDayOfPi1790A {

	private static final String PI = "314159265358979323846264338327";
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		while(lines-- > 0) {
			String[] s = sc.nextLine().split("");
			System.out.println(getNumberCorrent(s));
		}
		sc.close();
	}
	
	public static int getNumberCorrent(String[] s) {
		for (int i = 0; i < s.length; i++) {
			if(s[i].charAt(0) != PI.charAt(i)) {
				return i;
			}
		}
		return s.length;
	}

}
