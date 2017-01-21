package uebungen;

public class Aufgabe3 {
	public static void main(String[] args) {
		int[] liste = {1,4,5,8,10,9};
		int[] replic = replicate(liste);
		for(int ele : replic)
			System.out.println(ele);
	}

	private static int[] replicate(int[] liste) {
		return replicate(liste, new int[liste.length], 0);
	}

	private static int[] replicate(int[] liste, int[] ret, int pos) {
		if(pos<ret.length){
			ret[pos] = liste[pos];
			return replicate(liste, ret, ++pos);
		}
		return ret;
	}
}
