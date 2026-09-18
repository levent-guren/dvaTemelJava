package ornek5;

public class Calistir {
	public static void main(String[] args) throws InterruptedException {
		Sayac sayac = new Sayac();
		Thread t1 = new Thread(sayac);
		t1.start();
		Thread t2 = new Thread(sayac);
		t2.start();
		// Sayac.bekle(3000);
		t1.join(); // run metodunun bitmesini bekliyor.
		t2.join();
		System.out.println("Program bitti " + Sayac.sayi);
	}
}
