import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Triple1669B {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		while(lines-- > 0) {
			int n = sc.nextInt();
			sc.nextLine();
			String s = sc.nextLine();
			if(n<3) {
				System.out.println(-1);
			}else {
				System.out.println(getNumberOfTriple(s));
			}
		}
		sc.close();
	}

	private static String getNumberOfTriple(String s) {
		HashMap<String, Integer> map = new HashMap<>();
		for (String str : s.split(" ")) {
			if(map.containsKey(str))
				map.put(str, map.get(str)+1);
			else 
				map.put(str, 1);
		}
		String result = "-1";
		int maxCount = 3;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue() >= maxCount) result = entry.getKey();
		}
		return result;
		
	}

}
