import java.util.Scanner;

public class Buttons1858A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		while(lines-- > 0) {
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt()%2;
			int dif = a-b;
			if(dif > 0) {
				System.out.println("First");
			}else if(dif < 0) {
				System.out.println("Second");
			}else {
				System.out.println(c==1 ? "First":"Second");
			}
		}
		sc.close();
	}

}
