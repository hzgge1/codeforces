import java.util.Arrays;
import java.util.Scanner;

public class OnlyPluses1992A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		while(lines-- > 0) {
			int[] arr = stringToIntArray(sc.nextLine());
			arr = plus5(arr);
			System.out.println(valueOf(arr));
		}
		sc.close();
	}

	private static int valueOf(int[] arr) {
		int result = 1;
		for (int i : arr) {
			result *= i;
		}
		return result;
	}

	private static int[] plus5(int[] arr) {
		for (int i = 0; i < 5; i++) {
			Arrays.sort(arr);
			arr[0]++;
		}
		return arr;
	}

	private static int[] stringToIntArray(String s) {
		String[] data = s.split(" ");
		int[] arr = new int[data.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(data[i]);
		}
		return arr;
	}

}
