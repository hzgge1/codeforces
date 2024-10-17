import java.util.ArrayList;
import java.util.Scanner;

public class TeamOlympiad490A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> program = new ArrayList<Integer>();
		ArrayList<Integer> math = new ArrayList<Integer>();
		ArrayList<Integer> sport = new ArrayList<Integer>();
		sc.nextLine();
		String[] data = sc.nextLine().split(" ");
		for(int i=0;i<data.length;i++)
			if(data[i].equals("1")) program.add(i+1);
			else if(data[i].equals("2")) math.add(i+1);
			else sport.add(i+1);
		int min = Math.min(Math.min(program.size(), math.size()), sport.size());
		System.out.println(min);
		if(min!=0) {
			for(int i=0;i<min;i++)
				System.out.println(program.get(i)+" "+math.get(i)+" "+sport.get(i));			
		}
		sc.close();
	}

}
