package problems201_300;
import java.util.Scanner;

public class QueueAtTheSchool266B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), t = sc.nextInt();
		sc.nextLine();
		String[] v = sc.nextLine().split("");
		for(int i=0;i<t;i++) {
			for(int j=0;j<n-1;j++)
				if(v[j].contains("B") && v[j+1].contains("G")) {
					v[j] = "G"; v[j+1] = "B";j++;
				}
		}
		System.out.println(String.join("", v));
		sc.close();
	}
	
	
}
