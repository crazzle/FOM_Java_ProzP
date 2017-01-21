package uebungen;
import tastatur.Tastatur;


public class Aufgabe8 {
	public static void main(String args[]) {
		System.out.print("Anzahl eingeben: ");
		int anzahl = Tastatur.readInteger();
		System.out.println();
		while (anzahl > 0) {
			System.out.print("Ziehe eine Zahl: ");
			anzahl -= Tastatur.readInteger();
			System.out.println("Verbleibend: " + anzahl);
			System.out.println();
		}
		System.out.println("gewonnen.");
	}
}
