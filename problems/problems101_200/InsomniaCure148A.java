package problems101_200;
import java.util.Scanner;

public class InsomniaCure148A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt(), l = sc.nextInt(), m = sc.nextInt(), n = sc.nextInt(), d = sc.nextInt(),
				result = 0;
		for(int i=1;i<=d;i++) {
//			System.err.println("i="+i+"|"+(i%k==0 || i%l==0 || i%m==0 || i%n==0)+"|result="+result);
			if(i%k==0 || i%l==0 || i%m==0 || i%n==0) result++;
		}
		System.out.println(result);
		sc.close();
	}

}
