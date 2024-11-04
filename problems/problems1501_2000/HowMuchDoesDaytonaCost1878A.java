package problems1501_2000;
import java.util.Scanner;

public class HowMuchDoesDaytonaCost1878A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		while(lines-- >0) {
			String[] s1 = sc.nextLine().split(" ");
			System.out.println((" "+sc.nextLine()+" ").contains(" "+s1[1]+" ")? "YES":"NO");
		}
		sc.close();
	}

}
