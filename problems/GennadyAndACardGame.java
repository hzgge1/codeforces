import java.util.Scanner;

public class GennadyAndACardGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.nextLine().split("");
		String s = sc.nextLine();
		System.out.println((s.contains(arr[0]) || s.contains(arr[1])) ? "YES":"NO");
		sc.close();
	}

}
