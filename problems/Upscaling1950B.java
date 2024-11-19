import java.util.Scanner;

public class Upscaling1950B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		while(lines-- > 0) {
			System.out.print(getCheckerBoard(sc.nextInt()));
		}
		sc.close();
	}

	private static String getCheckerBoard(int n) {
		String result = "";
		String[] arr = getParAndImparLine(n);
		for (int i = 0; i < n; i++) {
			result += arr[i%2] + arr[i%2];
		}
		return result;
	}
	
	private static String[] getParAndImparLine(int n) {
		String[] arr = new String[2];
		arr[0] = "";
		arr[1] = "";
		boolean change = true;
		for (int i = 0; i < n; i++) {
			if(change) {
				arr[0] += "##";
				arr[1] += "..";
			}else {
				arr[0] += "..";
				arr[1] += "##";
			}
			change = !change;
		}
		arr[0] += "\n";
		arr[1] += "\n";
		return arr;
	}

}
