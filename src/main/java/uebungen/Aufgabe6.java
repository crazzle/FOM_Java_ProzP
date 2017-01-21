package uebungen;

public class Aufgabe6 {
	public static void main(String[] args) {
		int[] liste = {1,2,3,4,5,5,6,8,9,10};
		bubbleSort(liste);
		for(int ele : liste)
			System.out.println(ele);
	}

	private static void bubbleSort(int[] liste) {
		for(int i = 1; i < liste.length; i++){
			for(int j = 0; j < liste.length-i; j++){
				if(liste[j]>liste[j+1]){
					tausche(j, j+1, liste);
				}
			}
		}
	}

	private static void tausche(int i, int j, int[] liste) {
		int temp = liste[i];
		liste[i] = liste[j];
		liste[j] = temp;
	}
}
