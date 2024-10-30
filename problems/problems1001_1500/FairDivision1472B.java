package problems1001_1500;
import java.util.Scanner;

public class FairDivision1472B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < lines; i++) {
			sc.nextLine();
			String s = sc.nextLine().replace(" ", "");
			division(s);
		}
		sc.close();
	}
	
	public static void division(String s) {
		int number1 = s.replace("2","").length();
		int number2 = s.replace("1", "").length();
		if(number1 % 2 != 0) {
			System.out.println("NO");
		}else {
			if(number2 % 2 == 0) {
				System.out.println("YES");
			}else {
				if(number1>=2) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}
		}
	}
}
