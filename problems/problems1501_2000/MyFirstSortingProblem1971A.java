package problems1501_2000;
import java.util.Scanner;

public class MyFirstSortingProblem1971A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		while(lines-- > 0) {
			int x = sc.nextInt(), y = sc.nextInt();
			System.out.println(x>y? y+" "+x:x+" "+y);
		}
		sc.close();
	}

}
