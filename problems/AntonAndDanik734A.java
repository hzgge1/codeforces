import java.util.Scanner;

public class AntonAndDanik734A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine().toUpperCase();
		if(n<1 || n>100000 || !s.replace("A", "").replace("D", "").isEmpty()) return;
		int danik = s.replace("A", "").length(),anton = s.length()-danik;
		if(danik>anton) System.out.println("Danik");
		else if(anton>danik) System.out.println("Anton");
		else System.out.println("Friendship");
		sc.close();
	}

}
