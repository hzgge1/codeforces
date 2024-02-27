import java.util.Scanner;

public class WordCapitalization281A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if(s.length()>1000) return;
		s = s.substring(0, 1).toUpperCase()+s.substring(1, s.length());
		System.out.println(s);
		sc.close();
	}

}
