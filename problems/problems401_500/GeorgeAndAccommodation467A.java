import java.util.Scanner;

public class GeorgeAndAccommodation467A {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), result = 0;
		for(int i=0;i<n;i++) {
			int p = sc.nextInt(), q = sc.nextInt();
			if(q-p>=2) result++;
		}
		System.out.println(result);
		sc.close();
	}
	
}
