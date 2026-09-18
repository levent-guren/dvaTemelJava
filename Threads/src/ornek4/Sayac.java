package ornek4;

public class Sayac implements Runnable {
	public static int sayi = 0;

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			int s = sayi;
			bekle(100);
			sayi = s + 1;
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
