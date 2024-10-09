import java.util.Scanner;

public class PoliceRecruits427A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number_police = 0, result = 0;
		int rep = sc.nextInt();
		while((rep--)>0) {
			int aux = sc.nextInt();
			if(aux < 0) {
				if(number_police >0) number_police --;
				else result++;
			}else number_police+=aux;
		}
		System.out.println(result);
		sc.close();
	}

}
