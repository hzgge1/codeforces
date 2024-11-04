import java.util.Scanner;

public class AtillasFavoriteProblem1760B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		while(lines-- > 0) {
			sc.nextLine();
			getlaggestCharNumer(sc.nextLine());
		}
		sc.close();
	}

	private static void getlaggestCharNumer(String s) {
		int result = 0;
		while(!s.equals("")) {
			char c = s.charAt(0);
			if(c-96>result) 
				result = c-96;
			s = s.replace(""+c,"");
		}
		System.out.println(result);
	}
}
