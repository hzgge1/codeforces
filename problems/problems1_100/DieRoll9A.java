package problems1_100;
import java.util.Scanner;

public class DieRoll9A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int yakko = sc.nextInt(), wakko = sc.nextInt();
		int max = Math.max(yakko, wakko);
		int r = 6 - max;
		switch(r) {
		case 0 : 
			System.out.println("1/6");
			break;
		case 1 :
			System.out.println("1/3");
			break;
		case 2 :
			System.out.println("1/2");
			break;
		case 3 :
			System.out.println("2/3");
			break;
		case 4 :
			System.out.println("5/6");
			break;
		case 5 :
			System.out.println("1/1");
			break;
		default : 
			System.out.println("default");
		}
		sc.close();
	}

}
