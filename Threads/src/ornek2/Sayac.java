package ornek2;

public class Sayac implements Runnable {
	private String isim;

	public Sayac(String isim) {
		this.isim = isim;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(isim + ": " + i);
			bekle(1000);
		}
	}

	public static void bekle(long ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
