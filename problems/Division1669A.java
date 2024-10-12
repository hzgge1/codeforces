import java.util.Scanner;

public class Division1669A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		for(int i=0;i<lines;i++) {
			int n = sc.nextInt();
			int division;
			if(n >= 1900) division = 1;
			else if(n >= 1600 && n <= 1899) division = 2;
			else if(n >= 1400 && n <= 1599) division = 3;
			else division = 4;
			System.out.println("Division "+division);
		}
		sc.close();
	}

}
