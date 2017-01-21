package uebungen;

public class Aufgabe7 {
	public static void main(String[] args) {
		int[] liste = {1,2,3,4,5,6,5,8,10,9};
		insertSort(liste);
		for(int ele : liste)
			System.out.println(ele);
	}

	private static void insertSort(int[] liste) {
		for(int i = 1; i < liste.length; i++){
			int min = liste[i];
			int j = i;
			while(j > 0 && liste[j - 1] > min){
				liste[j] = liste[j-1];
				j--;
			}
			liste[j]=min;
		}
	}
}
