package problems201_300;
import java.util.Scanner;

public class BeautifulYear271A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		boolean rep = true;
		while(rep) {
			rep = false;
			y++;
			String s = Integer.toString(y);
//			System.out.println(s);
			for(int i=0;i<s.length()-1;i++) {
				int aux = s.length()-s.replace(s.substring(i,i+1), "").length();
//				System.out.println(aux);
				if(aux>1) {
					rep = true;
				}
			}
//			System.out.println(rep);
		}
		System.out.println(y);
		sc.close();
	}
}
