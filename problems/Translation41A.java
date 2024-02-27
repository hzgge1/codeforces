import java.util.Scanner;

public class Translation41A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine(), t = sc.nextLine();
		String r = new StringBuffer(t).reverse().toString();
//		System.out.println("s="+s+"|t="+t+"|r="+r);
		System.out.println(s.replace(r, "").isEmpty()?"YES":"NO");
		sc.close();
	}
}
