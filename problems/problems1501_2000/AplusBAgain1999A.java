package problems1501_2000;
import java.util.Scanner;

public class AplusBAgain1999A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		for(int i=0;i<lines;i++) {
			String[] data = sc.nextLine().split("");
			System.out.println(Integer.parseInt(data[0])+Integer.parseInt(data[1]));
		}
			
		sc.close();
	}

}
