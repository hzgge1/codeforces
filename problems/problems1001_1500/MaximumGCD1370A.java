package problems1001_1500;
import java.util.Scanner;

public class MaximumGCD1370A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		for(int i=0;i<lines;i++) {
			int n = sc.nextInt();
			System.out.println(getMaxGCD(n)); 
		}
		sc.close();
	}
	
	public static int getMaxGCD(int n) {
		for(int i=n/2+1;i>0;i--) {
			int count = 0;
			for(int j=n;j>0;j--) {
				if(j%i==0) count++;
				if(count>1) return i;
			}
		}
		return 1;
	}

}
