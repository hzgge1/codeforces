package problems1501_2000;
import java.util.Scanner;

public class ShortSort1873A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < lines; i++) {
			String s = sc.nextLine();
			if (change(s, 0, 1).equals("abc") || change(s, 0, 2).equals("abc") || change(s, 1, 2).equals("abc")
					|| s.equals("abc"))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		sc.close();
	}

	public static String change(String s, int index1, int index2) {
		String[] data = s.split("");
		String temp = data[index1];
		data[index1] = data[index2];
		data[index2] = temp;
		return data[0] + data[1] + data[2];
	}
}
