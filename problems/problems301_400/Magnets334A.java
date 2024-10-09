import java.util.Scanner;

public class Magnets334A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), result = 1 , aux = sc.nextInt();
		for(int i=1;i<n;i++) {
			int next = sc.nextInt();
			if(aux!=next) {
				result++;
				aux = next;
			}
		}
		System.out.println(result);
		sc.close();
	}
}
