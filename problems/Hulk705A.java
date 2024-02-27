import java.util.Scanner;

public class Hulk705A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String result = "I hate";
		String love = " that I love", hate = " that I hate";
		for(int i=2;i<=n;i++)
			if(i%2==0) result += love;
			else result += hate;
		System.out.println(result+" it");
		sc.close();
	}

}
