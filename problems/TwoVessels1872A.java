import java.util.Scanner;

public class TwoVessels1872A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		while(lines-- > 0) {
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
			int div = Math.abs(a-b)/c;
			int r = Math.abs(a-b)%c;
			if(div%2==0) {
				System.out.println(r==0 ? div/2 : div/2 + 1);
			}else {
				System.out.println(div/2+1);
			}
		}
		sc.close();
	}

}
