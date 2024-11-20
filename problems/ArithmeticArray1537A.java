import java.util.Scanner;

public class ArithmeticArray1537A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		while (lines-- > 0) {
			int n = Integer.parseInt(sc.nextLine());
			int[] arr = stringToIntArray(sc.nextLine().split(" "));
			double sum = sumOfArray(arr);
			
			if (sum > n) {
				System.out.println((int) sum - n);
			} else if(sum==n){
				System.out.println(0);
			}else {
				System.out.println(1);
			}

		}
		sc.close();
	}

	private static double sumOfArray(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}

	public static int[] stringToIntArray(String[] s) {
		int[] arr = new int[s.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(s[i]);
		}
		return arr;
	}

}
