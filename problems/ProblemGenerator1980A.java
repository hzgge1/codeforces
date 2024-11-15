import java.util.Scanner;

public class ProblemGenerator1980A {
	
	private static final String sequence = "ABCDEFG";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		while(lines-- > 0) {
			String data = getMultipleString(Integer.parseInt(sc.nextLine().split(" ")[1]));
			for(String str : sc.nextLine().split("")) {
				data = data.replaceFirst(str, "");
			}
			System.out.println(data.length());
		}
		sc.close();
	}

	private static String getMultipleString(int m) {
		String data = "";
		while(m-- >0) {
			data += sequence;
		}
		return data;
	}

}
