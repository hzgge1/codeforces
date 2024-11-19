import java.util.Scanner;
import java.util.StringJoiner;

public class Advantage1760C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		StringBuilder output = new StringBuilder();
		while (lines-- > 0) {
			int n = Integer.parseInt(sc.nextLine());
			String[] s = sc.nextLine().split(" ");
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(s[i]);
			}
			int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
			for (int i : arr) {
				if (i > max2) {
					if (i > max1) {
						max2 = max1;
						max1 = i;
					} else {
						max2 = i;
					}
				}
			}
			StringJoiner result = new StringJoiner(" ");
			for (int value : arr) {
				if (value == max1) {
					result.add(String.valueOf(value - max2));
				} else {
					result.add(String.valueOf(value - max1));
				}
			}
			output.append(result).append("\n");
		}
		System.out.print(output);
		sc.close();
	}

}
