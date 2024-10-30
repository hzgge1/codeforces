import java.util.Scanner;

public class GoodKid1873B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		for (int i = 0; i < lines; i++) {
			int result = 1;
			int n = sc.nextInt();
			int min = sc.nextInt();
			for (int j = 1; j < n; j++) {
				int x = sc.nextInt();
				if(x<min) {
					result *= min;
					min = x;
				}else {
					result *= x;
				}
			}
			System.out.println(result*(min+1));
		}
		sc.close();
	}

}
