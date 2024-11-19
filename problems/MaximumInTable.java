import java.util.Scanner;

public class MaximumInTable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(getMaxInTable(n,n));
		sc.close();
	}

	private static int getMaxInTable(int i,int j) {
		if(i==1) return 1;
		else if(j==1) return 1;
		else {
			return getMaxInTable(i-1, j) + getMaxInTable(i, j-1);
		}
	}

}
