import java.util.Scanner;

public class Bit282A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int x = 0;
		int i=0;
		while(i++<n) {
			String s = sc.nextLine();
			if(s.contains("++")) x++;
			if(s.contains("--")) x--;
			
		}
		System.out.println(x);
		sc.close();
	}
}
