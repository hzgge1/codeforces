package problems101_200;
import java.util.Scanner;

public class LuckyDivision122A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		double d = Double.parseDouble(s);
		if(d>Math.pow(10, 18) || d<1) return;
		if(!nearlyLuckyNumber(s)) {
			if(d%4==0 || d%7==0 || d%47==0) {
				System.out.println("YES");
				return;
			}else if(s.replace("4", "").replace("7", "").isEmpty()) {
				System.out.println("YES");
				return;
			}else System.out.println("NO");
		}else System.out.println("YES");
		sc.close();
	}
	
	public static boolean nearlyLuckyNumber(String s) {
		String aux = s.replace("4", "").replace("7", "");
		if(Integer.toString(s.length()-aux.length()).replace("4", "").replace("7", "").isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
}
