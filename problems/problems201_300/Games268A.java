package problems201_300;
import java.util.HashMap;
import java.util.Scanner;

public class Games268A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int n = sc.nextInt();
		int[] v = new int[n];
		for(int i=0;i<n;i++) {
			int h = sc.nextInt(), a = sc.nextInt();
			v[i] = h;
			if(map.containsKey(a)) map.put(a, map.get(a)+1);
			else map.put(a, 1);
//			System.out.println("map = "+map);
		}
		int result = 0;
		for(int i : v) {
			if(map.containsKey(i))
				result += map.get(i);
		}
		System.out.println(result);
		sc.close();
	}
}
