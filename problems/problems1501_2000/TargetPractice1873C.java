package problems1501_2000;
import java.util.Scanner;

public class TargetPractice1873C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number_test = Integer.parseInt(sc.nextLine());
		while(number_test-- > 0) {
			int point = 0;
			for (int i = 0; i < 10; i++) {
				String[] s = sc.nextLine().split("");
				for (int j = 0; j < 10; j++) {
					if(s[j].equals("X"))
						point += getPoint(i+1,j+1);
				}
			}
			System.out.println(point);
		}
		sc.close();
	}

	private static int getPoint(int i, int j) {
		if(i<=5) {
			if(j>=i && j <= 11-i) {
				return i;
			}else {
				if(j<=5) {
					return j;
				}else {
					return 11-j;
				}
			}
		}else {
			return getPoint(11-i, j);
		}
	}

}
