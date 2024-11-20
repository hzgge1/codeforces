package problems1201_1300;
import java.util.Scanner;

public class ArrayWithOddSum1296A {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		while(lines-- > 0) {
			int n = sc.nextInt();
			sc.nextLine();
			String s = sc.nextLine();
			System.out.println(canBeOddSum(s,n)? "YES":"NO");
		}
		sc.close();
	}

	private static boolean canBeOddSum(String s, int n) {
		boolean par = false, impar = false;
		if(n%2 == 0) {
			for(String str : s.split(" ")) {
				if(Integer.parseInt(str)%2 == 0) 
					par = true;
				else 
					impar = true;
				if(par && impar) return true;
			}
		}else {
			for(String str : s.split(" ")) {
				if(Integer.parseInt(str)%2 != 0) 
					return true;
			}
		}
		return false;
	}
}
