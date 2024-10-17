package problems301_400;
import java.util.ArrayList;
import java.util.Scanner;

public class SerejaAndDima381A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rep = sc.nextInt();
		boolean isSereja = true;
		sc.nextLine();
		ArrayList<Integer> list = StringToList(sc.nextLine());
		int sereja = 0, dima = 0;
		for(int i=0;i<rep;i++) {
			if(list.get(0)>list.get(list.size()-1)) {
				if(isSereja) 
					sereja += list.get(0);
				else 
					dima += list.get(0);
				list.remove(0);
			}else {
				if(isSereja) 
					sereja += list.get(list.size()-1);
				else 
					dima += list.get(list.size()-1);
				list.remove(list.size()-1);
			}
			isSereja = !isSereja;
		}
		System.out.println(sereja+" "+dima);
		sc.close();
	}
	
	public static ArrayList<Integer> StringToList(String s) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		String[] arr = s.split(" ");
		for(String str : arr)
			list.add(Integer.parseInt(str));
		return list;
	}

}
