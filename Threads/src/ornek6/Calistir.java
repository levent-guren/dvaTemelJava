package ornek6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Calistir {
	public static void main(String[] args) throws InterruptedException {
		Sayac sayac = new Sayac();

		ExecutorService service = Executors.newFixedThreadPool(5);
		service.submit(sayac);
		service.submit(sayac);
		service.shutdown();
		boolean allDone = service.awaitTermination(10, TimeUnit.SECONDS);
		if (allDone) {
			System.out.println("Program bitti " + Sayac.sayi);
		} else {
			System.out.println("Timeout oluştu. Sayaçlar durmadı.");
		}
		service.close();
	}
}
