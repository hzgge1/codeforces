import java.util.Scanner;

public class EqualCandies1676B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		for (int i = 0; i < lines; i++) {
			int result = 0;
			int n = sc.nextInt();
			int min = sc.nextInt();
			for (int j = 1; j < n; j++) {
				int x = sc.nextInt();
				if(x<min) {
					result += (min-x)*j;
					min = x;
				}else {
					result += (x-min);
				}
			}
			System.out.println(result);
		}
		sc.close();
	}

}
