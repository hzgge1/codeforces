import java.util.Scanner;

public class SpellCheck1722A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < lines; i++) {
			int n = Integer.parseInt(sc.nextLine());
			String s = sc.nextLine();
			if(n != 5) {
				System.out.println("NO");
			}else {
				if(s.contains("T") && s.contains("i") && s.contains("m") &&
						s.contains("u") && s.contains("r")) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}
		}
		sc.close();
	}

}
