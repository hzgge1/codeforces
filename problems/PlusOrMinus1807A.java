import java.util.Scanner;

public class PlusOrMinus1807A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		for(int i=0;i<lines;i++)
			System.out.println(sc.nextInt()+sc.nextInt()==sc.nextInt()? "+":"-");
		sc.close();
	}
	
}
