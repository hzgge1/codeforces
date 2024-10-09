package problems101_200;
import java.util.Scanner;

public class NextRound158A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.nextLine();
		String[] data = sc.nextLine().split(" ");
		int all = k;
		if(data[k-1].equals("0")) {
			all = 0;
			while(all<k && !data[all].equals("0")) {
				all++;
			}
		}else {
			while(all<data.length && data[all].equals(data[k-1])) {
				all++;
			}			
		}
		System.out.println(all);
		sc.close();
	}
}
