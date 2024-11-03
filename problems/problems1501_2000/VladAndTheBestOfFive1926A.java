package problems1501_2000;
import java.util.Scanner;

public class VladAndTheBestOfFive1926A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < lines; i++) {
			System.out.println((sc.nextLine().replace("A", "").length()<3)? "A":"B");
		}
		sc.close();
	}

}
