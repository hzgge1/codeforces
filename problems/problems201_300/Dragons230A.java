import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Dragons230A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int strong = sc.nextInt() , n = sc.nextInt();
		int[][] v = new int[n][2];
		for(int i=0;i<n;i++) {
			int dragon = sc.nextInt(), strongUp = sc.nextInt();
			v[i][0] = dragon;
			v[i][1] = strongUp; 
		}
		Arrays.sort(v, new Comparator<int[]>() {
            public int compare(final int[] entry1, final int[] entry2) {
                return Integer.compare(entry1[0], entry2[0]);
            }
        });
		for(int[] i : v) {
			if(i[0] < strong) strong += i[1];
			else {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
		sc.close();
	}

}
