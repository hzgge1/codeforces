import java.util.Scanner;

public class LinearKeyboard1607A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		while(lines-- > 0) {
			int result = 0;
			String order = sc.nextLine();
			String[] s = sc.nextLine().split("");
			int index = -1;
			for (String str : s) {
				if(index == -1) {
					index = order.indexOf(str);
				}else {
					result += Math.abs(index - order.indexOf(str));
					index = order.indexOf(str);
				}
			}
			System.out.println(result);
		}
		sc.close();
	}

}
