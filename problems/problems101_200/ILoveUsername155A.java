package problems101_200;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ILoveUsername155A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rep = sc.nextInt(), result = 0;
		ArrayList<Integer> games = new ArrayList<Integer>();
		games.add(sc.nextInt());
		if(rep <= 1 ) System.out.println(0);
		else {
			for(int i=1;i<rep;i++) {
				int newGame = sc.nextInt();
				if(more(listToArray(games),newGame) || less(listToArray(games),newGame)) result++;
				games.add(newGame);
			}
			System.out.println(result);
		}
		sc.close();
	}
	
	public static boolean more(int[] oldGames, int newGame) {
		for(int game : oldGames) {
			if(newGame <= game) return false;
		}
		return true;
	}
	
	public static boolean less(int[] oldGames, int newGame) {
		for(int game : oldGames) {
			if(newGame >= game) return false;
		}
		return true;
	}
	public static int[] listToArray(ArrayList<Integer> list) {
		int[] result = new int[list.size()];
		for(int i=0;i<result.length;i++)
			result[i] = list.get(i);
		return result;
	}

}
