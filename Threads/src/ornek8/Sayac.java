package ornek8;

public class Sayac implements Runnable {
	public static volatile boolean dur = false;

	@Override
	public void run() {
		while (!dur) {
		}
		System.out.println("Sayac durdu");
	}

	public static void bekle(long ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
