package threads.bankkonto;

public class Einzahler implements Runnable {
	
	private int betrag, ersparnis;
	
	public Einzahler(int betrag, int ersparnis){
		this.betrag = betrag;
		this.ersparnis = ersparnis;
	}
	
	@Override
	public void run() {
		while (ersparnis > 0) {
			Bankkonto.einzahlen(betrag);
			ersparnis -= betrag;
			try {
				Thread.sleep(25);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
