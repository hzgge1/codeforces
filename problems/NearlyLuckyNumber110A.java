import java.util.Scanner;

public class NearlyLuckyNumber110A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if(Double.parseDouble(s)>Math.pow(10, 18) || Double.parseDouble(s)<1) return;
		String aux = s.replace("4", "").replace("7", "");
		if(Integer.toString(s.length()-aux.length()).replace("4", "").replace("7", "").isEmpty()) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
		sc.close();
	}

}
