import java.util.Scanner;

public class Word59A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = 0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(Character.isUpperCase(c)) n++;
		}
		if(n*2>s.length()) s=s.toUpperCase();
		else s=s.toLowerCase();
		System.out.println(s);
		sc.close();
	}

}
