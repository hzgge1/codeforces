import java.util.Scanner;

public class VanyaAndCubes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1, result = 1;
		while(n>=count) {
			n -= count;
			result ++;
			count += result;
		}
		System.out.println(result-1);
		sc.close();
	}

}
