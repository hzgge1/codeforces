import java.util.Scanner;

public class WayTooLongWords71A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    sc.nextLine();
	    if(n<1 || n>100) return;
	    for(int i=0;i<n;i++) {
	    	String s = sc.nextLine();
	    	if(s.length()<=10) {
	    		System.out.println(s);
	    	}else {
	    		System.out.print(s.charAt(0));
	    		System.out.print(s.length()-2);
	    		System.out.println(s.charAt(s.length()-1));	    		
	    	}
	    }
	    sc.close();
	}

}
