import java.util.Scanner;

public class BalancedArray1343B {
	
	private static int sum = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		for(int i=0;i<lines;i++) {
			int n = sc.nextInt();
			if((n/2)%2 != 0) System.out.println("NO");
			else {
				System.out.println("YES");
				firstPart(n/2);
				secoundPart(n/2);
				System.out.println();
			}
		}
		sc.close();
	}
	
	private static void secoundPart(int x) {
		int number = 0, count = 1;
		String s = "";
		for(int i=0;i<x-1;i++) {
			number += count;
			System.out.print(count + " ");
			count += 2;
		}
		System.out.print(sum-number);
	}

	public static void firstPart(int x) {
		int number = 0, count = 2;
		String s = "";
		for(int i=0;i<x;i++) {
			number += count;
			System.out.print(count + " ");
			count+=2;
		}
		sum = number;
	}

}
