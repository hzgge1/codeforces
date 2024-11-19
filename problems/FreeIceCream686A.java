import java.util.Scanner;

public class FreeIceCream686A {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long x = sc.nextInt();
		int count = 0;
		sc.nextLine();
		while(n-- > 0) {
			String[] s = sc.nextLine().split(" ");
			long aux = Integer.parseInt(s[1]);
			if(s[0].equals("+")) {
				x += aux;
			}else {
				if(x>=aux) {
					x -= aux;
				}else {
					count++;
				}
			}
		}
		System.out.println(x+" "+count);
		sc.close();
	}

}
