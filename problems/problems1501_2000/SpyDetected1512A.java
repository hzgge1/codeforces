package problems1501_2000;
import java.util.Scanner;

public class SpyDetected1512A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int rep = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<rep;i++) {
			sc.nextLine();
			System.out.println(function(sc.nextLine()));
		}
		sc.close();
	}
	
	public static int function(String s) {
		String[] arr = s.split(" ");
		int a1 = Integer.parseInt(arr[0]), a2 = Integer.parseInt(arr[1]);
		if(a1 == a2 ) {
			for(int i=2;i<arr.length;i++)
				if(Integer.parseInt(arr[i]) != a1) return i+1;	
		}
		return Integer.parseInt(arr[2])==a1? 2:1;
	}

}
