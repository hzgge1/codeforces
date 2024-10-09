package problems201_300;
import java.util.Scanner;

public class BoyOrGirl236A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if(s.length()>100)return;
		int n = 0;
		s = s.toLowerCase();
		while(s.length()!=0) {
			s = s.replace(s.substring(0, 1), "");
			n++;
		}
		if(n%2 == 0) System.out.println("CHAT WITH HER!");
		else System.out.println("IGNORE HIM!");
		sc.close();
	}

}
