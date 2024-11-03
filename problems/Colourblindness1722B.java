import java.util.Scanner;

public class Colourblindness1722B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < lines; i++) {
			int n = Integer.parseInt(sc.nextLine());
			System.out.println(function(n,sc.nextLine(),sc.nextLine())?"YES":"NO");
		}
		sc.close();
	}

	private static boolean function(int n, String s1, String s2) {
		String[] line1 = s1.split(""), line2 = s2.split("");
		for (int i = 0; i < n; i++) {
			if(line1[i].equals("R")) {
				if(!line1[i].equals(line2[i])) return false; 
			}else {
				if(line2[i].equals("R")) return false;
			}
		}
		return true;
	}

}
