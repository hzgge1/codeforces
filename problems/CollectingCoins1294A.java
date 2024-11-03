import java.util.Scanner;

public class CollectingCoins1294A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		for (int i = 0; i< lines;i++) {
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), n = sc.nextInt();
			if(function(a,b,c,n)) {
				System.out.println("NO");
			}else {
				System.out.println((a+b+c+n)%3==0?"YES":"NO"); 				
			}
		}
		sc.close();
	}

	private static boolean function(int a, int b, int c,int n) {
		if(a>=b && a>=c) {
			return a*2-b-c > n;
		}else if(b>=a && b>=c) {
			return b*2-a-c > n; 
		}else {
			return c*2-a-b > n;
		}
	}
}
