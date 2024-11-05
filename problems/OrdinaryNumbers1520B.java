import java.util.Scanner;

public class OrdinaryNumbers1520B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		while(lines-- > 0) {
			System.out.println(function(sc.nextInt()));
		}
		sc.close();
	}

	private static int function(int n) {
		if(n<10) {
			return n;
		}else {
			String[] s = (""+n).split("");
			int count = (s.length-1)*9 + Integer.parseInt(s[0])-1;	
			if(isAllSameNumber(""+n)) {
				count++;
			}
			return count;
		}
	}

	private static boolean isAllSameNumber(String data) {
		String[] s = data.split("");
		if(s.length>1) {
			if(Integer.parseInt(s[0]) < Integer.parseInt(s[1])) {
				return true;
			}else if(Integer.parseInt(s[0]) == Integer.parseInt(s[1])) {
				return isAllSameNumber(data.substring(1));
			}else {
				return false;
			}
		}else {
			return true;
		}
		
	}

}
