package problems701_800;
import java.util.Scanner;

public class BrainsPhotos707A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		sc.nextLine();
		System.out.println(isColor(h,sc)? "#Color":"#Black&White");
		sc.close();
	}

	private static boolean isColor(int h, Scanner sc) {
		for (int i = 0; i < h; i++) {
			String s = sc.nextLine();
			if(s.contains("C") || s.contains("M") || s.contains("Y")) {
				return true;
			}
		}
		return false;
	}

}
