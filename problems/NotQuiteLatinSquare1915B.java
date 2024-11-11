import java.util.Scanner;

public class NotQuiteLatinSquare1915B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = Integer.parseInt(sc.nextLine());
		while(lines-- > 0) {
			int a = 0, b = 0;
			for (int i = 0; i < 3; i++) {
				String s = sc.nextLine();
				for(String str : s.split("")) {
					switch(str.charAt(0)) {
					case 'A' : 
						a++;
						break;
					case 'B' :
						b++;
						break;
					}
				}
			}
			if(a!=3) {
				System.out.println("A");
			}else if(b!=3) {
				System.out.println("B");
			}else {
				System.out.println("C");
			}
		}
		sc.close();
	}

}
