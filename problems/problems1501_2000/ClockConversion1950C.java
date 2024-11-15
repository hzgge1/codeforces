package problems1501_2000;
import java.util.Scanner;

public class ClockConversion1950C {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		while(lines-- > 0) {
			String[] s = sc.nextLine().split(":");
			String result = s[1];
			if(Integer.parseInt(s[0])<12) {
				if(s[0].equals("00")) {
					result = "12:" + result;
				}else{
					result = s[0] + ":" + result;
				}
				result += " AM";
			}else {
				if(s[0].equals("12")) {
					result = s[0] + ":" + result;
				}else {
					result = Integer.parseInt(s[0])-12 + ":" + result;
				}
				if(result.length() == 4)
					result = 0 + result;
				result += " PM";
			}
			System.out.println(result);
		}
		sc.close();
	}

}
