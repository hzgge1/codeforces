package problems1501_2000;
import java.util.Scanner;

public class LoveStory1829A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] codeforces = "codeforces".split("");
		int lines = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < lines; i++) {
			int count = 0;
			String[] data = sc.nextLine().split("");
			for (int j = 0; j < data.length; j++) {
				if(!codeforces[j].equals(data[j])) count++;
			}
			System.out.println(count);
		}
		
		sc.close();
	}

}
