import java.util.Scanner;

public class AplusB1772A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < lines; i++) {
			String[] data = sc.nextLine().split("\\+");
			System.out.println(Integer.parseInt(data[0])+Integer.parseInt(data[1]));
		}
		sc.close();
	}

}
