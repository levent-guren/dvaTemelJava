package ornek7;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Calistir {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Sayac sayac = new Sayac();

		ExecutorService service = Executors.newFixedThreadPool(5);
		Future<Integer> f1 = service.submit(sayac);
		Future<Integer> f2 = service.submit(sayac);
		service.shutdown();
		boolean allDone = service.awaitTermination(10, TimeUnit.SECONDS);
		if (allDone) {
			System.out.println("Program bitti " + Sayac.sayi);
			System.out.println("f1:" + f1.get());
			System.out.println("f2:" + f2.get());
		} else {
			System.out.println("Timeout oluştu. Sayaçlar durmadı.");
		}
		service.close();
	}
}
