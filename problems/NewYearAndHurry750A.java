import java.util.Scanner;

public class NewYearAndHurry750A {
	
	public static void main(String[] args) {
		int time_total = 4*60;
		Scanner sc = new Scanner(System.in);
		int number_questions = sc.nextInt();
		int time_limak = sc.nextInt();
		time_total -= time_limak;
		int result = 0;
		while((time_total>=(result+1)*5) && result+1 <= number_questions) {
			result++;
			time_total -= result*5;
		}
		System.out.println(result);
		sc.close();
	}

}
