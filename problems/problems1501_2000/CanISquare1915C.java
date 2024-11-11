package problems1501_2000;
import java.util.Scanner;

public class CanISquare1915C {

	public static class Square{
		
		private double area;
		
		public Square() {
			this.area = 0;
		}
		
		public void addArea(double n) {
			this.area += n;
		}
		
		public boolean canBeSquare() {
			double sqrt = Math.sqrt(area);
			return sqrt == (int)sqrt;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		while(lines-- > 0) {
			int n = sc.nextInt();
			Square s = new Square();
			while(n-- > 0) {
				s.addArea(sc.nextInt());
			}
			System.out.println(s.canBeSquare()? "YES":"NO");
		}
		sc.close();
	}
	
}
