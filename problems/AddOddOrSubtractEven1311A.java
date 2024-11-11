import java.util.Scanner;

public class AddOddOrSubtractEven1311A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		while(lines-- > 0) {
			int a = sc.nextInt(), b = sc.nextInt();
			if(a <= b)
				if(a==b) 
					System.out.println(0);
				else 
					System.out.println((b-a) % 2 == 0 ? 2 : 1);
			else 
				System.out.println( (a-b) % 2 == 0 ? 1 : 2);
			
		}
		sc.close();
	}

}
