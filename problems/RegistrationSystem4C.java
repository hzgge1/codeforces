import java.util.*;
import java.util.Scanner;

public class RegistrationSystem4C {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		int n = sc.nextInt();sc.nextLine();
		for(int i=0;i<n;i++) {
			String name = sc.nextLine();
			if(map.containsKey(name)) {
				map.put(name, map.get(name)+1);
				System.out.println(name+map.get(name));
			}else {
				map.put(name, 0);
				System.out.println("OK");
			}
		}
		sc.close();
	} 
	
	
}
