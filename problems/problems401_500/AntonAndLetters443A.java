import java.util.HashSet;
import java.util.Scanner;

public class AntonAndLetters443A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<String> set = new HashSet<String>();
		String string = sc.nextLine().replace("{", "").replace("}", "").replace(" ","");
		if(string.isEmpty()) System.out.println(0);
		else {
			String[] v = string.split(",");
			for(String s : v) 
				set.add(s);
			System.out.println(set.size());
		}
		sc.close();			
	}

}
