package uebungen;

public class Aufgabe5 {
	public static void main(String[] args) {
		int[] liste = {1,5,4,5,8,10,9};
		selectSort(liste);
		for(int ele : liste)
			System.out.println(ele);
	}

	private static void selectSort(int[] liste) {
		for(int i = 0; i < liste.length - 1; i++){
			for(int j = i+1; j < liste.length; j++){
				if(liste[i]>liste[j]){
					tausche(i, j, liste);
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
