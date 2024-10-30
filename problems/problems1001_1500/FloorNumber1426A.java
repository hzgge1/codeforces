package problems1001_1500;
import java.util.Scanner;

public class FloorNumber1426A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		for (int i = 0; i < lines; i++) {
			getFloor(sc.nextInt(),sc.nextInt());
		}
		sc.close();
	}

	private static void getFloor(int n, int x) {
		int number_apartment = 2;
		int floor = 1;
		while(n>number_apartment) {
			number_apartment += x;
			floor++;
		}
		System.out.println(floor);
	}

}
