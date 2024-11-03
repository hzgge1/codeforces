import java.util.Scanner;

public class Elephant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextInt();
		if(x>1000000 || x<1) {
			sc.close();
			return;
		}
		System.out.println((int)(Math.ceil(x/5)));
		sc.close();
	}

}
