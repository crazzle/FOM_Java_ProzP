package uebungen;

public class Aufgabe4 {
	public static void main(String[] args) {
		int[] liste = {1,4,5,8,10,9};
		int[] reverse = reverse(liste);
		for(int ele : reverse)
			System.out.println(ele);
	}

	private static int[] reverse(int[] liste) {
		return reverse(liste, new int[liste.length], liste.length);
	}

	private static int[] reverse(int[] liste, int[] ret, int pos) {
		if(pos>0){
			ret[liste.length-pos] = liste[pos-1];
			return reverse(liste, ret, --pos);
		}else{
			ret[liste.length-1] = liste[pos];
		}
		return ret;
	}
}
