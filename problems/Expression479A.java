import java.util.Scanner;

public class Expression479A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		int result = Math.max(a+b+c, Math.max(a+b*c, Math.max(a*(b+c), Math.max(a*b*c, (a+b)*c))));
		System.out.println(result);
		sc.close();
	}
	
	

}
