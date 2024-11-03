package problems1501_2000;
import java.util.Scanner;

public class BlankSpace1829B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < lines; i++) {
			sc.nextLine();
			String[] data = sc.nextLine().replace(" ", "").split("1");
			System.out.println(getMaxSpace(data));
		}
		sc.close();
	}

	private static int getMaxSpace(String[] data) {
		int max = 0;
		for(String s : data )
			if(max < s.length()) max = s.length();
		return max;
	}

}
