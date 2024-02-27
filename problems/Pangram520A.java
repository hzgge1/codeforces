import java.util.HashSet;
import java.util.Scanner;

public class Pangram520A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		HashSet<Character> set = new HashSet<Character>();
		for(char c : s.toCharArray())
			set.add(Character.toLowerCase(c));
		System.out.println(set.size()==26?"YES":"NO");
		sc.close();
	}
}
