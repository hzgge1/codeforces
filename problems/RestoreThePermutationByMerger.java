import java.util.ArrayList;
import java.util.Scanner;

public class RestoreThePermutationByMerger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		while(lines-- > 0) {
			ArrayList<String> list = new ArrayList<>(); 
			sc.nextLine();
			String[] s = sc.nextLine().split(" ");
			for (String str : s) {
				if(!list.contains(str))
					list.add(str);
			}
			System.out.println(list.toString().replace(",", "").replace("[", "").replace("]", ""));
		}
		sc.close();

	}

}
