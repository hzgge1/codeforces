import java.util.Scanner;

public class BearAndBigBrother791A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int limak = sc.nextInt();
		int bob = sc.nextInt();
		int year = 0;
		while(limak<=bob) {
			year++;
			limak = limak*3;
			bob = bob*2;
		}
		System.out.println(year);
		sc.close();
	}
}
