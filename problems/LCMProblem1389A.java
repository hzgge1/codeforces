import java.util.Scanner;

public class LCMProblem1389A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		while(lines-- > 0) {
			int l = sc.nextInt(), r = sc.nextInt();
			System.out.println(r>=2*l ? (l+" "+2*l) : "-1 -1");
		}
		sc.close();
	}

}
