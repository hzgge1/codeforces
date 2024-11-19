package problems1_100;

import java.util.Scanner;

public class Borze32B {

	public static void main(String[] args) {
		String result = "";
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.nextLine().split("");
		int index = 0;
		for(int i=0;i<arr.length;i++) {
			if(i==index) {
				if(arr[i].equals(".")) {
					result += "0";
					index++;
				}
			}else {
				if(arr[i].equals(".")) result += "1";
				else result += "2";
				index+=2;
			}
		}
		System.out.println(result);
		sc.close();
	}

}
