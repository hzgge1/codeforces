package problems1101_1200;
import java.util.ArrayList;
import java.util.Scanner;

public class RestoringThreeNumbers1154A {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		int[] x = new int[4];
		x[0] = sc.nextInt();
		x[1] = sc.nextInt();
		x[2] = sc.nextInt();
		x[3] = sc.nextInt();
		x = sort(x);
		a = x[0]-x[1];
		b = x[2]-a;
		if(x[1]-b == x[2]-a) c = x[2]-a;
		else c = x[3]-a;
		System.out.println(a+" "+b+" "+c);
		sc.close();
	}
	
	public static int[] sort(int[] x) {
		for(int i=0;i<x.length-1;i++)
			for(int j=i+1;j<x.length;j++)
				if(x[j]>x[i]) { int temp = x[i]; x[i] = x[j]; x[j] = temp;}
		return x;
	}

}
