package problems1501_2000;
import java.util.Scanner;

public class MediumNumber1760A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		for(int i=0;i<lines;i++) {
			int[] arr = new int[3];
			arr[0] = sc.nextInt(); arr[1]=sc.nextInt(); arr[2]=sc.nextInt();
			arr = sort(arr);
			System.out.println(arr[1]);
		}
		sc.close();
	}
	
	public static int[] sort(int[] arr) {
		for(int i=0; i<arr.length; i++)
			for(int j=i;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
				}
			}
		return arr;
	}
	
}
