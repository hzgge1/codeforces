import java.util.Scanner;

public class AmusingJoke141A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine()+sc.nextLine(), letters = sc.nextLine();
		for(char c : name.toCharArray()) {
			String s = Character.toString(c);
			if(letters.contains(s)) {
				int index = letters.indexOf(s);
				letters = letters.substring(0,index)+letters.substring(index+1);
			}else {
				System.out.println("NO");
				return;
			}
		}
		System.out.println(letters.isEmpty()?"YES":"NO");
		sc.close();
	}

}
