import java.util.Scanner;

public class GiftsFixing1399B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		while(lines-- > 0) {
			getMinSteps(Integer.parseInt(sc.nextLine()),sc.nextLine(),sc.nextLine());
		}
		sc.close();
	}

	private static void getMinSteps(int n, String candies, String oranges) {
		String[] c = candies.split(" ");
		String[] o = oranges.split(" ");
		
		int min_candy = Integer.parseInt( c[0] );
		int min_orange = Integer.parseInt( o[0] );
		
		int[][] m = new int[n][2];
		for (int i = 0; i < m.length; i++) {
			m[i][0] = Integer.parseInt(c[i]);
			m[i][1] = Integer.parseInt(o[i]);
			if(m[i][0] < min_candy) min_candy = m[i][0];
			if(m[i][1] < min_orange) min_orange = m[i][1];
		}
		
		long result = 0L;
		for (int i = 0; i < m.length; i++) {
			result += Math.max(m[i][0]-min_candy, m[i][1]-min_orange);
			System.err.println("steps="+(Math.max(m[i][0]-min_candy, m[i][1]-min_orange))+"|result="+result);
		}
		System.out.println(result);
	}

}
