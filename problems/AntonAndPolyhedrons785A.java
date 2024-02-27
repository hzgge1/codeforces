import java.util.HashMap;
import java.util.Scanner;

public class AntonAndPolyhedrons785A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,Integer> map = new HashMap<String, Integer>();
		map.put("Tetrahedron", 4);
		map.put("Cube", 6);
		map.put("Octahedron", 8);
		map.put("Dodecahedron", 12);
		map.put("Icosahedron", 20);
		
		int n = sc.nextInt(), result = 0;
		sc.nextLine();
		for(int i=0;i<n;i++) {
			result += map.get(sc.nextLine());
		}
		System.out.println(result);
		sc.close();
	}
}
