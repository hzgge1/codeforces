import java.util.Scanner;

public class VanyaAndFence677A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt() , h = sc.nextInt(), length = 0;
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			if(a>h) length+=2;
			else length++;
		}
		System.out.println(length);
		sc.close();
	}
}
