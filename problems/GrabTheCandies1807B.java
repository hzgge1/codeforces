import java.util.Scanner;

public class GrabTheCandies1807B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		while(lines-- > 0) {
			int mihai = 0, bianca = 0;
			int n = sc.nextInt();
			while(n-- > 0) {
				int candies = sc.nextInt();
				if(candies % 2 == 0)
					mihai += candies;
				else
					bianca += candies;
			}
			System.out.println(mihai>bianca ? "YES":"NO");
		}
		sc.close();
	}

}
