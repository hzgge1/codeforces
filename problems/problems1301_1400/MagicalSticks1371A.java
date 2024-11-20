package problems1301_1400;
import java.util.Scanner;

public class MagicalSticks1371A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		for (int i = 0; i < lines; i++) {
			System.out.println((sc.nextInt()+1)/2);
		}
		sc.close();
	}
}
