package problems1401_1500;
import java.util.Scanner;

public class FavoriteSequence1462A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		while(lines-- > 0) {
			int n = sc.nextInt();
			sc.nextLine();
			System.out.println( restoreSequence(sc.nextLine(),n) );
		}
		sc.close();
	}

	private static String restoreSequence(String s, int n) {
		String[] arr = s.split(" ");
		String result = "";
		boolean change = true;
		int index_begin = 0, index_end = n-1;
		while(n-- > 0) {
			if(change) {
				result += arr[index_begin++] + " ";
			}else {
				result += arr[index_end--] + " ";
			}
			change = !change;
		}
		return result;
	}
	
}
