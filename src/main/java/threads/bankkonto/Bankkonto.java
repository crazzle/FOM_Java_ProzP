package threads.bankkonto;

public class Bankkonto {
	static Integer kontostand = 0;

	static synchronized void einzahlen(int betrag) {
		System.out.println("Aktueller Kontostand: " + kontostand);
		System.out.println("Betrag: " + betrag);
		kontostand += betrag;
		System.out.println("Neuer Kontostand: " + kontostand);
	}

	public static void main(String[] args) throws InterruptedException {
		// Threads
		Thread t1 = new Thread(new Einzahler(5, 500));
		Thread t2 = new Thread(new Einzahler(10, 1000));
		Thread t3 = new Thread(new Einzahler(15, 1500));
		Thread t4 = new Thread(new Einzahler(20, 2000));
		Thread t5 = new Thread(new Einzahler(5, 500));
		Thread t6 = new Thread(new Einzahler(10, 1000));
		Thread t7 = new Thread(new Einzahler(15, 1500));
		Thread t8 = new Thread(new Einzahler(20, 2000));
		Thread t9 = new Thread(new Einzahler(5, 500));
		Thread t10 = new Thread(new Einzahler(10, 1000));
		Thread t11 = new Thread(new Einzahler(15, 1500));
		Thread t12 = new Thread(new Einzahler(20, 2000));

		// Threads starten
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		t11.start();
		t12.start();

	}
}
