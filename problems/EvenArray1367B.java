import java.util.ArrayList;
import java.util.Scanner;

public class EvenArray1367B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		for(int i=0;i<lines;i++) {
			int n = Integer.parseInt(sc.nextLine());
			if(n==1) {
				if(Integer.parseInt(sc.nextLine())%2!=0) {
					System.out.println(-1);
				}else {
					System.out.println(0);
				}
			}else {
				int[] arr = getIntArray(sc.nextLine());
				System.out.println(getMiniChanges(arr));
			}
		}
		sc.close();
	}

	public static int[] getIntArray(String s) {
		String[] data = s.split(" ");
		int[] arr = new int[data.length];
		for (int i = 0; i < arr.length; i++)
			arr[i] = Integer.parseInt(data[i]);
		return arr;
	}
	
	public static int getMiniChanges(int[] arr) {
		int result = 0;
		ArrayList<Integer> mod0 = new ArrayList<Integer>();
		ArrayList<Integer> mod1 = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(i%2!=arr[i]%2) {
				int mod = arr[i]%2;
				if(mod==0) {
					if(!mod1.isEmpty()) {
						arr = change(arr, i, mod1.get(0));
						result++;
						mod1.remove(0);						
					}else {
						mod0.add(i);
					}
				}else {
					if(!mod0.isEmpty()) {
						arr = change(arr, i, mod0.get(0));
						result++;
						mod0.remove(0);
					}else {
						mod1.add(i);
					}
				}
			}
		}
		if(mod0.isEmpty() && mod1.isEmpty()) return result;
		else return -1;
	}
	
	public static int[] change(int[] arr,int a,int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		return arr;
	}
	
}
