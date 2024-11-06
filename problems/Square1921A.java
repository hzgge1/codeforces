import java.util.Scanner;

public class Square1921A {
	
	private static class Point{
		public int x;
		public int y;
		
		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		while(lines-- > 0) {
			Point p1 = new Point(sc.nextInt(),sc.nextInt());
			Point p2 = new Point(sc.nextInt(),sc.nextInt());
			Point p3 = new Point(sc.nextInt(),sc.nextInt());
			Point p4 = new Point(sc.nextInt(),sc.nextInt());
			if(p1.x == p2.x) {
				System.out.println(Math.abs(p1.y-p2.y)*Math.abs(p3.y-p4.y));
			}else if(p1.x == p3.x) {
				System.out.println(Math.abs(p1.y-p3.y)*Math.abs(p2.y-p4.y));
			}else {
				System.out.println(Math.abs(p1.y-p4.y)*Math.abs(p2.y-p3.y));
			}
		}
		sc.close();
	}

}
