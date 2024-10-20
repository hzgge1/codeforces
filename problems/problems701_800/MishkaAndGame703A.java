package problems701_800;
import java.util.Scanner;

public class MishkaAndGame703A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mishka = 0, chris = 0;
		int lines = sc.nextInt();
		for(int i=0;i<lines;i++) {
			int m = sc.nextInt(), c = sc.nextInt();
			if(m>c) mishka++;
			else if(m<c) chris++;
		}
		if(mishka>chris) System.out.println("Mishka");
		else if(chris>mishka) System.out.println("Chris");
		else System.out.println("Friendship is magic!^^");
		sc.close();
	}
	
}
