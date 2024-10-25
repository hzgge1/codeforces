package problems701_800;
import java.util.Scanner;

public class BuyAShovel732A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 1;
		int k = sc.nextInt(), r = sc.nextInt();
		while((k*result)%10!=r && (k*result)%10!=0) result++;
		System.out.println(result);
		sc.close();
	}

}
