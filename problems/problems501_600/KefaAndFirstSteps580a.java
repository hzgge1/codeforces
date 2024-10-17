package problems501_600;
import java.util.Scanner;

public class KefaAndFirstSteps580a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), max = 1, count = 1,
			x = sc.nextInt(), y;
		for(int i=1;i<n;i++) {
			y = sc.nextInt();
			if(x<=y) {
				count++;
			}else {
				count = 1;
			}
			x = y;
			if(max<count) max = count;
		}
		System.out.println(max);
		sc.close();
	}

}
