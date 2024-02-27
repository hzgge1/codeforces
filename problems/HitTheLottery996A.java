import java.util.Scanner;

public class HitTheLottery996A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] bills = {1,5,10,20,100};
		int n = sc.nextInt(),result = 0;
		for(int i=bills.length-1;i>=0;i--) {
			int x = n/bills[i];
			if(x>0) result += x;
			n -= x*bills[i];
			if(n==0) break;
		}
		System.out.println(result);
		sc.close();
	}

}
