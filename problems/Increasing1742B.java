import java.util.Scanner;

public class Increasing1742B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < lines; i++) {
			int n = Integer.parseInt(sc.nextLine());
			int[] arr = sort(sc.nextLine().split(" "));
			if(n==1) {
				System.out.println("YES");
			}else {
				System.out.println(isIncreasing(arr)? "YES":"NO");
			}
		}
		sc.close();
	}

	private static boolean isIncreasing(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i]>=arr[i+1]) return false;
		}
		return true;
	}

	private static int[] sort(String[] data) {
		int[] arr = StringToIntegerArray(data);
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

	private static int[] StringToIntegerArray(String[] s) {
		int[] arr = new int[s.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		return arr;
	}

}
