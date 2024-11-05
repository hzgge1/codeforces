import java.util.Scanner;

public class WordOnThePaper1850C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		while(lines-- > 0) {
			String s = "";
			for (int i = 0; i < 8; i++) {
				s += sc.nextLine().replace(".", "");
			}
			System.out.println(s);
		}
		sc.close();
	}
	
}
