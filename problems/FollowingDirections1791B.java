import java.util.Scanner;

public class FollowingDirections1791B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		sc.nextLine();
		while(lines-- > 0) {
			sc.nextLine();
			System.out.println(passeTheCandy(sc.nextLine().split(""))? "YES":"NO");
		}
		sc.close();
	}
	
	public static boolean passeTheCandy(String[] s) {
		int x = 0, y = 0;
		for(String str : s) {
			switch(str) {
			case "U":
				y++;
				break;
			case "D":
				y--;
				break;
			case "L":
				x--;
				break;
			case "R":
				x++;
				break;
			}
			if(x==1 && y==1) {
				return true;
			}
		}
		return false;
	}

}
