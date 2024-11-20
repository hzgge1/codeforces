package problems1201_1300;
import java.util.Scanner;

public class MinutesBeforeTheNewYear1283A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		for (int i = 0; i < lines; i++) {
			int h = sc.nextInt(), m = sc.nextInt();
			System.out.println((24-h)*60-m);
		}
		sc.close();
	}

}
