package problems701_800;
import java.util.Scanner;

public class NightAtTheMuseum731A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String s = sc.nextLine(), oldChar = "a";
		for(String str : s.split("")) {
			if(!str.equals(oldChar)) {
				count += getMinSteps(oldChar, str);				
				oldChar = str;				
			}
		}
		System.out.println(count);
		sc.close();
	}

	private static int getMinSteps(String oldChar, String str) {
		return Math.min(Math.min(Math.abs(oldChar.charAt(0)-str.charAt(0)), oldChar.charAt(0)-str.charAt(0)+26),26-oldChar.charAt(0)+str.charAt(0));
		
	}

}
