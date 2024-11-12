package problems1001_1500;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveSmallest1399A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		while(lines-- > 0) {
			sc.nextLine();
			int[] arr = stringToIntArray(sc.nextLine());
			Arrays.sort(arr);
 			System.out.println(function(arr)? "YES":"NO");
		}
		sc.close();
	}

	private static int[] stringToIntArray(String s) {
		String[] data = s.split(" ");
		int[] arr = new int[data.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(data[i]);
		}
		return arr;
	}

	private static boolean function(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i+1] - arr[i] > 1) return false;
		}
		return true;
	}

}
