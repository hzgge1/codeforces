import java.util.Scanner;

public class IQTest25A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int[] v = new int[n];
		for(int i=0;i<n;i++)
			v[i] = sc.nextInt();
		int evencount = 0, evenindex = 0, oddindex = 0;
		for(int i=0;i<n;i++) {
			if(v[i]%2 == 0) {
				evencount++; evenindex = i+1;
			}else
				oddindex = i+1;
		}
		System.out.println(evencount==1?evenindex:oddindex);
		sc.close();
	}

}
