package problems1501_2000;

import java.util.Scanner;

public class StairPeakOrNeither1950A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		for(int i=0;i<lines;i++) {
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
			if(a<b && b<c) System.out.println("STAIR");
			else if(b>a && b>c) System.out.println("PEAK");
			else System.out.println("NONE");
		}
		sc.close();
	}

}
