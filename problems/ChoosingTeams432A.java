import java.util.Scanner;

public class ChoosingTeams432A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt(), count = 0;
		for(int i=0;i<n; i++) {
			if(5-sc.nextInt()>=k) count++;
		}
		System.out.println(count/3);
		sc.close();
	}

}
