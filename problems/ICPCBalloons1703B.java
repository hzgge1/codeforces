import java.util.Scanner;

public class ICPCBalloons1703B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < lines; i++) {
			function(Integer.parseInt(sc.nextLine()),sc.nextLine());
		}
		sc.close();
	}

	private static void function(int n, String s) {
		String resolved = "";
		int result = 0;
		String[] data = s.split("");
		for (String str : data) {
			if(resolved.contains(str)) {
				result++;
			}else {
				resolved += str;
				result += 2;
			}
		}
		System.out.println(result);
	}

}
