package problems1501_2000;
import java.util.ArrayList;
import java.util.Scanner;

public class RudolfAndTheTicket1941A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		while(lines-- > 0) {
			int count = 0;
			String[] s = sc.nextLine().split(" ");
			int k = Integer.parseInt( s[s.length-1] );
			ArrayList<Integer> right = getCoinsOfPocket(sc.nextLine(),k);
			ArrayList<Integer> left = getCoinsOfPocket(sc.nextLine(),k);
			for (Integer r : right) {
				for (Integer l : left) {
					if(r+l<=k) count++;
				}
			}
			System.out.println(count);
		}
		sc.close();
	}

	private static ArrayList<Integer> getCoinsOfPocket(String s, int k) {
		ArrayList<Integer> list = new ArrayList<>();
		for (String str : s.split(" ")) {
			if(Integer.parseInt(str)<k) list.add(Integer.parseInt(str));
		}
		return list;
	}

}
