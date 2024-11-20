package problems1301_1400;
import java.util.Scanner;

public class HonestCoach1360B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < lines; i++) {
			int n = Integer.parseInt(sc.nextLine());
			if(n == 2) {
				System.out.println(Math.abs(sc.nextInt()-sc.nextInt()));
				sc.nextLine();
			}else {
				System.out.println(function(sc.nextLine()));
			}
		}
		sc.close();
	}

	private static int function(String s) {
		int[] arr = stringToIntegerArray(s.split(" "));
		arr = sort(arr);
		int min = arr[1] - arr[0];
		for (int i = 1; i < arr.length-1; i++) {
			if(arr[i+1]-arr[i] < min) min = arr[i+1] - arr[i];
		}
		return min;
	}

	private static int[] sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	private static int[] stringToIntegerArray(String[] data) {
		int[] arr = new int[data.length];
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(data[i]);
		}
		return arr;
	}

}
