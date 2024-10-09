import java.util.Scanner;

public class TheNewYearMeetingFriends723A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt(), x2 = sc.nextInt(), x3 = sc.nextInt();
		System.out.println(Math.max(Math.max(Math.abs(x1-x2), Math.abs(x2-x3)), Math.abs(x1-x3)));
		sc.close();
	}
	
}
