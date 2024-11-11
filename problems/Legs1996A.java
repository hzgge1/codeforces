import java.util.Scanner;

public class Legs1996A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		while(lines-- > 0) {
			int n = sc.nextInt();
			System.out.println(n/4+(n%4)/2);
		}
		sc.close();
	}

}