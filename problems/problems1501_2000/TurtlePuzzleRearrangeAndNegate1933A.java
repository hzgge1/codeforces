package problems1501_2000;
import java.util.Scanner;

public class TurtlePuzzleRearrangeAndNegate1933A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		while(lines-- > 0){
			int result = 0;
			int n = sc.nextInt();
			while(n-- > 0) {
				result += Math.abs(sc.nextInt());
			}
			System.out.println(result);
		}
		
		sc.close();

	}

}
