package problems201_300;
import java.util.Scanner;

public class Team231A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int all=0;
		int n = sc.nextInt();
		sc.nextLine();
		if(n<0||n>1000) return;
		for(int i=0;i<n;i++) {
			String s = sc.nextLine();
			String[] data = s.split(" ");
			if(data.length != 3) return;
			if(data[0].equals("1") &&(data[1].equals("1")||data[2].equals("1"))) all++;
			else if(data[1].equals("1")&&data[2].equals("1")) all++;
		}
		System.out.println(all);
		sc.close();
	}
}
