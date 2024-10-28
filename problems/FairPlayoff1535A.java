import java.util.Scanner;

public class FairPlayoff1535A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		for (int i = 0; i < lines; i++) {
			int[] arr = sort(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
			if(arr[1]<arr[3]) {
				if(arr[1]<arr[2]) {
					System.out.println("NO");
				}else {
					System.out.println("YES");
				}
			}else {
				if(arr[3]<arr[0]) {
					System.out.println("NO");
				}else {
					System.out.println("YES");
				}
			}
			
		}
		sc.close();
	}

	private static int[] sort(int nextInt, int nextInt2, int nextInt3, int nextInt4) {
		int[] arr = new int[4];
		arr[0] = Math.min(nextInt, nextInt2);
		arr[1] = Math.max(nextInt, nextInt2);
		arr[2] = Math.min(nextInt3, nextInt4);
		arr[3] = Math.max(nextInt3, nextInt4);
		return arr;
	}

}
