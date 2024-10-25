package problems1501_2000;
import java.util.Scanner;

public class CreatingWords1985A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		for(int i=0;i<lines;i++) {
			String[] data = sc.nextLine().split(" ");
			System.out.print(data[1].charAt(0)+data[0].substring(1));
			System.out.println(" "+data[0].charAt(0)+data[1].substring(1));
		}
		sc.close();
	}

}
