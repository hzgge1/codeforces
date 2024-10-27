import java.util.Scanner;

public class MinimalSquare1360A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		for (int i = 0; i < lines; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			getMininalSquare(Math.min(a, b), Math.max(a, b));
		}
		sc.close();
	}
	
	public static void getMininalSquare(int a, int b) {
		if(a*2 >= b) {
			System.out.println(a*a*4);
		}else {
			System.out.println(b*b);
		}
	}

}
