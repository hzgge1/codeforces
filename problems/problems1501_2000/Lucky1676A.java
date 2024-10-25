package problems1501_2000;
import java.util.Scanner;

public class Lucky1676A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < lines; i++) {
			String[] arr = sc.nextLine().split("");
			int firstThree = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]) + Integer.parseInt(arr[2]);
			int lastThree = Integer.parseInt(arr[3]) + Integer.parseInt(arr[4]) + Integer.parseInt(arr[5]);
			System.out.println(firstThree==lastThree?"YES":"NO");
		}
		sc.close();
	}

}
