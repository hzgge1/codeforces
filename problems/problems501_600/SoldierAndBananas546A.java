package problems501_600;
import java.util.Scanner;

public class SoldierAndBananas546A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt(); // pay k dollars for first banana
		int n = sc.nextInt(); // has n dollars
		int w = sc.nextInt(); // w bananas will to buy
		if(k<1 || w>1000 || n<0 || n>1000000000) return;
		int x = 0; // value need to pay
		int i=1;
		while(i<=w) {
			x += i*k;
			i++;
//			System.out.println("x="+x+"|i="+i);
		}
		System.out.println(x-n<0?0:x-n);
		sc.close();
	}

}
