package problems1501_2000;
import java.util.Scanner;

public class GameWithIntegers1899A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		for (int i = 0; i < lines; i++) {
			System.out.println(sc.nextInt()%3==0 ? "Second":"First");
		}
		sc.close();
	}

}
