import java.util.HashMap;
import java.util.Scanner;

public class Taxi158B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),result = 0; 
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1, 0); map.put(2,0); map.put(3, 0); map.put(4, 0);
		for(int i=0;i<n;i++) {
			int key = sc.nextInt();
			map.put(key,map.get(key)+1);
		}
		result += map.get(4);
		result += map.get(3);
		double aux = map.get(2)*2;
		if(map.get(3)>=map.get(1)) {
			result += (int)Math.ceil(aux/4);
		}else {
			result += Math.ceil((aux+map.get(1)-map.get(3))/4);
		}
		System.out.println(result);
		sc.close();
	}

}
