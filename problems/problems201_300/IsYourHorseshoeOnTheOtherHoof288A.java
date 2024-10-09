package problems201_300;
import java.util.Scanner;

public class IsYourHorseshoeOnTheOtherHoof288A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] v = s.split(" ");
		int n = 0;
		for(int i=0;i<v.length;i++) {
			if(v[i].equals("x")) continue;
			n++;
			for(int j=i+1;j<v.length;j++) {
				if(v[j].equals(v[i])) v[j]="x";
			}
		}
		System.out.println(4-n<0?0:4-n);
		sc.close();
	}
}
