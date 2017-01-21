package uebungen;

public class Aufgabe2 {

	public static void main(String[] args) {
		int[] liste = {1,4,5,8,10,9};
		int[] taken = take(liste,3);
		for(int ele : taken)
			System.out.println(ele);
	}

	private static int[] take(int[] liste, int i) {
		return take(liste, new int[i], 0);
	}

	private static int[] take(int[] liste, int[] ret, int pos) {
		if(pos<ret.length){
			ret[pos] = liste[pos];
			return take(liste, ret, ++pos);
		}
		return ret;
	}
}
