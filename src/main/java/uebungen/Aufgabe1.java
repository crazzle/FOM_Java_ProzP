package uebungen;

public class Aufgabe1 {
	public static void main(String[] args){
		int[] liste = {1,4,5,8,10,9};
		int max = max(liste);
		System.out.println(max);
	}
	
	private static int max(int[] liste){
		return max(liste, 0, liste[0]);
	}
	
	private static int max(int[] liste, int pos, int max) {
		if(pos < liste.length){
			max = maxAus2Zahlen(liste[pos], max);
			pos++;
			return max(liste, pos, max);
		}
		return max;
	}

	private static int maxAus2Zahlen(int i, int max) {
		return (i>max)?i:max;
	}
}
