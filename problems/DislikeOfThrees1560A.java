import java.util.Scanner;

public class DislikeOfThrees1560A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		for(int i = 0; i < lines; i++) {
			int k = sc.nextInt();
			if(k<3) System.out.println(k);
			else
				System.out.println(function(k));
		}
		sc.close();
	}
	
	public static int function(int index) {
		int result = 4;
		int count = 3;
		while(count != index) {
			result++;
			if(result%3!=0 && Integer.toString(result).charAt(Integer.toString(result).length()-1)!='3') {
				count++;
			}
		}
		return result;
	}

}