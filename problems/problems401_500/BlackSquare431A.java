package problems401_500;
import java.util.Scanner;

public class BlackSquare431A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		int[] valueArray = getIntArray(sc.nextLine());
		String[] data = sc.nextLine().split("");
		for(String str : data)
			result += valueArray[Integer.parseInt(str)-1];
		System.out.println(result);
		sc.close();
		
	}
	
	public static int[] getIntArray(String s) {
		String[] data = s.split(" ");
		int[] arr = new int[data.length];
		for(int i=0;i<arr.length;i++)
			arr[i] = Integer.parseInt(data[i]);
		return arr;
	}

}
