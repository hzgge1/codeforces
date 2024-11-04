package problems701_800;
import java.util.Scanner;

public class MaximumIncrease702A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		int maxIncrease = 1;
		int count = 1;
		int x = sc.nextInt();
		while(--lines > 0) {
			int temp = sc.nextInt();
			if(x<temp) {
				count++;
			}else {
				if(count>maxIncrease) maxIncrease = count;
				count = 1;
			}
			x = temp;
		}
		System.out.println(Math.max(maxIncrease, count));
		sc.close();
	}

}
