import java.util.Scanner;

public class CAPSLOCK131A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String first = s.substring(0, 1), rest = s.substring(1);
		if(s.length()==1 && s.equals(s.toLowerCase())) 
			s = first.toUpperCase();
		else if(s.equals(s.toUpperCase()))
			s = s.toLowerCase();
		else if(first.equals(first.toLowerCase()) && rest.equals(rest.toUpperCase()))
			s = first.toUpperCase() + rest.toLowerCase();
		System.out.println(s);
		sc.close();
	}

}
