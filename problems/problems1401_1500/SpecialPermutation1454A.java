package problems1401_1500;
import java.util.Scanner;

public class SpecialPermutation1454A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		while(lines-- > 0) {
			int n = sc.nextInt();
			int[] arr = getSpecialPermutationIntArray(n);
			System.out.println(arrayToString(arr));
		}
		sc.close();
	}

	private static String arrayToString(int[] arr) {
		String s = "";
		for (int i : arr) {
			s += i + " ";
		}
		return s;
	}

	private static int[] getSpecialPermutationIntArray(int n) {
		int[] arr = getNormalPermutationIntArray(n);
		for (int i = 0; i < arr.length-1; i+=2) {
			arr = change(arr,i,i+1);
		}
		if(arr.length % 2 != 0) {
			arr = change(arr,0,arr.length-1);
		}
		return arr;
	}

	private static int[] change(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}

	private static int[] getNormalPermutationIntArray(int n) {
		int[] arr = new int[n];
 		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
 		return arr;
	}

}
