package problems1501_2000;
import java.util.Scanner;

public class PlusOneOnTheSubset1624A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < lines; i++) {
			sc.nextLine();
			int[] arr = stringToIntegerArray(sc.nextLine());
			if(arr.length == 1) System.out.println(0);
			else {
				System.out.println(getDiference(arr));
			}
		}
		sc.close();
	}

	public static int getDiference(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		for(int x : arr) {
			if(x>max) max = x;
			if(x<min) min = x;			
		}
		return max-min;
	}

	public static int[] stringToIntegerArray(String line) {
		String[] data = line.split(" ");
		int[] arr = new int[data.length];
		for(int i = 0; i<arr.length; i++)
			arr[i] = Integer.parseInt(data[i]);
		return arr;
	}

}
