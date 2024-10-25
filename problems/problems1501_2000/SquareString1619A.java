package problems1501_2000;
import java.util.Scanner;

public class SquareString1619A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		for(int i=0;i<lines;i++) {
			isSquareString(sc.nextLine());
		}
		sc.close();
	}

	private static void isSquareString(String nextLine) {
		if(nextLine.length()%2 != 0) System.out.println("NO");
		else{
			if(nextLine.substring(0, nextLine.length()/2).equals(nextLine.substring(nextLine.length()/2)))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}

}
