import java.util.Scanner;

public class HolidayOfEquality758A {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int rep = sc.nextInt();
		int max = sc.nextInt();
		for(int i=1;i<rep;i++) {
			int now = sc.nextInt();
			if(max < now) {
				result += (now-max)*i;
				max = now;
			}else if(max > now) {
				result += max-now;
			}
		}
		System.out.println(result);
		sc.close();
	}
	
}
