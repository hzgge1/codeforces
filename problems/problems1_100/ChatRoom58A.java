package problems1_100;
import java.util.Scanner;

public class ChatRoom58A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] hello = "hello".split("");
		for(int i=0;i<hello.length;i++) {
			if(!s.contains(hello[i])) {System.out.println("NO"); return;}
			int index = s.indexOf(hello[i]);
			s = s.substring(index+1);
//			System.out.println("("+hello[i]+")s="+s);
		}
		System.out.println("YES");
		sc.close();
	}
}
