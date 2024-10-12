import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author heng6
 *	not completed
 */

public class RemoveSmallest1399A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rep = sc.nextInt();
		for(int i=0;i<rep;i++) {
			ArrayList<String> list = new ArrayList<String>();
			String result = "YES";
			int n = sc.nextInt();
			sc.nextLine();
			String[] arr = sc.nextLine().split(" ");
			for(String s : arr) {
				if(!list.contains(s)) 
					list.add(s);
				if(list.size() == 3) {
					result = "NO";
					break;
				}
			}
			System.out.println(result);
		}
		sc.close();
	}

}
