package problems1301_1400;
import java.util.Scanner;

public class ThreePairwiseMaximums1385A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		while(lines-- > 0) {
			int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
			if(x!=y && y!=z && x!=z) {
				System.out.println("NO");
			}else {
				if(x==y) {
					if(z>x) { 
						System.out.println("NO");
					}else {
						System.out.println("YES");
						System.out.println(x+" "+z+" "+z);
					}
				}else if(x==z) {
					if(y>x) {
						System.out.println("NO");
					}else {
						System.out.println("YES");
						System.out.println(y+" "+x+" "+y);
					}
				}else {
					if(x>y) {
						System.out.println("NO");
					}else {
						System.out.println("YES");
						System.out.println(x+" "+x+" "+y);
					}
				}
			}
		}
		sc.close();
	}

}
