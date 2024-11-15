import java.util.Arrays;
import java.util.Scanner;

public class XAxis1986A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		while(lines-- > 0) {
			int[] arr = stringToIntArrayWithSorted(sc.nextLine().split(" "));
			System.out.println(arr[2]-arr[0]);
		}
		sc.close();
	}

	private static int[] stringToIntArrayWithSorted(String[] s) {
		int[] arr = new int[s.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		Arrays.sort(arr);
		return arr;
	}

}
