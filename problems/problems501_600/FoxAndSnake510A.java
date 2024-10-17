package problems501_600;
import java.util.Scanner;

public class FoxAndSnake510A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		String line = String.join("#",(new String[m+1])).replace("null", "");
		String points = line.substring(1).replace("#", ".");
		String left = "#"+points, right = points+"#";
//		System.out.println("line="+line+"|left="+left+"|right="+right);
		for(int i=1;i<=n;i++) {
			if(i%2!=0)System.out.println(line);
			else {
				System.out.println(i%4==0?left:right);
			}
		}
		sc.close();
	}

}
