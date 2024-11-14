import java.util.Scanner;

public class osuMania2009B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		while(lines-- > 0) {
			int n = sc.nextInt();
			sc.nextLine();
			String result = "";
			while(n-- > 0) {
				int index = sc.nextLine().indexOf("#")+1;
				result = index + " " + result;
			}
			System.out.println(result);
		}
		sc.close();
	}

}
