package problems401_500;
import java.util.Scanner;

public class IWannaBeTheGuy469A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int[] v = new int[n];
		String[] x = sc.nextLine().split(" "), y = sc.nextLine().split(" ");
		if(Integer.parseInt(x[0])!=0) {
			for(int i=1;i<x.length;i++) v[Integer.parseInt(x[i])-1] = 1;
		}
		if(Integer.parseInt(y[0])!=0) {
			for(int i=1;i<y.length;i++) v[Integer.parseInt(y[i])-1] = 1;
		}
		for(int i:v) 
			if(i==0) {
				System.out.println("Oh, my keyboard!");
				return;
			}
		
		System.out.println("I become the guy.");
		sc.close();
	}
}
