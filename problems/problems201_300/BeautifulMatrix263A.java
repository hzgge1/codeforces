package problems201_300;
import java.util.Scanner;

public class BeautifulMatrix263A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++)
			for(int j=0;j<5;j++) {
				int n = sc.nextInt();
				if(n==1) {
					System.out.println(miniTimes(i+1,j+1));
					return;
				}
			}
		sc.close();
	}

	private static int miniTimes(int x,int y) {
		int times = 0;
		while(x!=3 || y!=3) {
			if(x<3) {
				x++;
				times++;
			}else if(x>3){
				x--;
				times++;
			}else{
				if(y<3) {
					y++;
					times++;
				}else if(y>3){
					y--;
					times++;
				}
			}
//			System.out.println("x="+x+"|y="+y+"|times="+times);
		}
		return times;
	}

}
