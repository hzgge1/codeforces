package problems1501_2000;
import java.util.Scanner;

public class Marathon1692A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rep = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<rep;i++)
			System.out.println(function(sc.nextLine()));
		sc.close();		
	}
	
	public static int function(String s ) {
		String[] arr = s.split(" ");
		int a = Integer.parseInt(arr[0]), result = 0;
		for(int i=1;i<arr.length;i++)
			if(Integer.parseInt(arr[i]) > a) result++;
		return result;
	}

}
