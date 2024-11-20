package problems1301_1400;
import java.util.Scanner;

public class EhAbAnDgCd1325A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		while(lines-- > 0) {
			findNumbersWithLcmGcdSum(sc.nextInt());
		}
		sc.close();
	}

	private static void findNumbersWithLcmGcdSum(int x) {
		for(int g = 1; g <= x/2 ; g++) {
			if(x%g != 0) continue;
			int l = x - g;
			if(l<=0) continue;
			System.out.println(1+" "+l/g);
			break;
		}
		
	}

}
