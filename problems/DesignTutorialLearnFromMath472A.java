import java.util.Scanner;

public class DesignTutorialLearnFromMath472A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		for(int i=4;i<number;i++) {
			if(isCompositeNumber(i) && isCompositeNumber(number-i)) {
				System.out.println(i+" "+(number-i));
				break;
			}
		}
		sc.close();
	}
	
	public static boolean isCompositeNumber(int n) {
		int count = 1;
		for(int i=2; i<n; i++) {
			if(n%i==0) count++;
			if(count!=1) return true;			
		}
		return false;
	}

}
