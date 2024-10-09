import java.util.*;

public class SumOfRoundNumbers1352A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rep = sc.nextInt();
		while((rep--)>0) {
			int count = 0;
			String result = "";
			int number = sc.nextInt();
			if(number>10000 || number<1) return;
			while(number > 0) {
				int aux = function(number);
				number -= aux;
				count++;
				result += aux + " ";
			}
			System.out.println(count);
			System.out.println(result.substring(0, result.length()-1));
		}
		sc.close();
	}
	
	public static int function(int number) {
		int n = 0;
		if(number > 9999) n = 10000;
		else if(number > 999) n = 1000;
		else if(number > 99) n = 100;
		else if(number > 9) n = 10;
		else n = 1;
		return (number / n) * n;
	}

}
