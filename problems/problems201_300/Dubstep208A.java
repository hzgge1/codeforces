import java.util.Scanner;

public class Dubstep208A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine().replace("WUB", " ");
		while(s.contains("  ")) s = s.replace("  ", " ");
		if(s.charAt(0)==' ') s = s.substring(1);
		if(s.charAt(s.length()-1)==' ') s = s.substring(0, s.length()-1);
		System.out.println(s);
		sc.close();
	}

}
