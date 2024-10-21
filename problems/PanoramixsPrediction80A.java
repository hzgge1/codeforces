import java.util.Scanner;

public class PanoramixsPrediction80A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), y = sc.nextInt();
		System.out.println((!havePrimeNumber(x, y) && isPrimeNumber(y))? "YES":"NO");
		sc.close();
	}
	
	public static boolean havePrimeNumber(int x, int y) {
		for(int i=x+1;i<y;i++) {
			if(isPrimeNumber(i)) return true;
		}
		return false;
	}
	
	public static boolean isPrimeNumber(int number) {
		for(int i=2; i<number;i++) {
			if(number%i==0) return false;
		}
		return true;
	}

}
