package problems1501_2000;
import java.util.Scanner;

public class DoNotBeDistracted1520A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < lines; i++) {
			int n = Integer.parseInt(sc.nextLine());
			if(n == 1) {
				System.out.println("YES");
				sc.nextLine();
			}
			else {
				System.out.println(function(n,sc.nextLine())? "YES":"NO"); 
			}
		}
		
		sc.close();
	}

	private static boolean function(int n, String nextLine) {
		String[] data = nextLine.split("");
		String finish = "", old = data[0];
		for (String str : data) {
			if(!finish.contains(str)) {
				finish += str;
				old = str;
			}else {
				if(!old.equals(str))
					return false;
			}
		}
		return true;
	}

}
