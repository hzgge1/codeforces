package problems1401_1500;
import java.util.Scanner;

public class CardsForFriends1472A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		while(lines-- > 0) {
			int p = 1;
			int w = sc.nextInt(), h = sc.nextInt(), n = sc.nextInt();
			while(p<n) {
				if(w%2!=0 && h%2!=0)
					break;
				else 
					if(w%2==0) {
						w /= 2;
						p *= 2;
					}else {
						h /= 2;
						p *= 2;
					}
			}
			System.out.println(p>=n ? "YES":"NO");
		}
		sc.close();
	}

}
