package problems1401_1500;
import java.util.Scanner;

public class BoringApartments1433A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		for(int i=0;i<lines;i++) {
			int result = 0;
			String s = sc.nextLine();
			result += ((Integer.parseInt(s.substring(0, 1))-1)*10);
			for(int j=0;j<s.length();j++) {
				result +=(j+1);
			}
			System.out.println(result);
		}
		sc.close();
	}

}
