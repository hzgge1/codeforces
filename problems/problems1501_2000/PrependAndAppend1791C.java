package problems1501_2000;
import java.util.Scanner;

public class PrependAndAppend1791C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		while(lines-- > 0) {
			sc.nextLine();
			String[] s = sc.nextLine().split("");
			int ini = 0, fin = s.length-1;
			int count = 0;
			while(ini<fin) {
				if(!s[ini++].equals(s[fin--])) {
					count++;
				}else {
					break;
				}
			}
			System.out.println(s.length-count*2);
		}
		sc.close();
	}

}
