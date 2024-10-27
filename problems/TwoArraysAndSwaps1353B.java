import java.util.Scanner;

public class TwoArraysAndSwaps1353B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < lines; i++) {
			int n = sc.nextInt(), k = sc.nextInt(); 
			sc.nextLine();
			String str1 = sc.nextLine(), str2 = sc.nextLine(); 
			int[] a = stringToIntegerArray(str1,n);
			int[] b = stringToIntegerArray(str2,n);
			for (int j = 0; j < k; j++) {
				int min_index_a = getIndexOfArray(a,true); // true -> min
				int max_index_b = getIndexOfArray(b,false); //false -> max 
				if(a[min_index_a] >= b[max_index_b]) {
					break;
				}else {
					changeValue(a,b,min_index_a,max_index_b);
				}
			}
			System.out.println(getSumOfArray(a));
 		}
		sc.close();

	}
	
	private static void changeValue(int[] a, int[] b, int min_index_a, int max_index_b) {
		int temp = a[min_index_a];
		a[min_index_a] = b[max_index_b];
		b[max_index_b] = temp;
	}

	private static int getSumOfArray(int[] a) {
		int result = 0;
		for(int i : a)
			result += i;
		return result;
	}

	private static int getIndexOfArray(int[] a, boolean type) {
		int index = 0;
		for (int i = 1; i < a.length; i++) {
			if(type) {
				if(a[i]<a[index])
					index = i;
			}else {
				if(a[i]>a[index])
					index = i;
			}
		}
		return index;
	}

	public static int[] stringToIntegerArray(String s,int n) {
		String[] data = s.split(" ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(data[i]);
		}
		return arr;
	}

}
