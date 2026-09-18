package ornek7;

import java.util.concurrent.Callable;

public class Sayac implements Callable<Integer> {
	public static int sayi = 0;

	@Override
	public Integer call() throws Exception {
		for (int i = 0; i < 10; i++) {
			arttir();
		}
		return sayi;
	}

	private synchronized void arttir() {
		int s = sayi;
		bekle(100);
		sayi = s + 1;
	}

	public static void bekle(long ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
