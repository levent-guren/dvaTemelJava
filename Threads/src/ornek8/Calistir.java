package ornek8;

public class Calistir {
	public static void main(String[] args) throws InterruptedException {
		Sayac sayac = new Sayac();
		new Thread(sayac).start();
		Sayac.bekle(1000);
		Sayac.dur = true;
		System.out.println("Program sonu");
	}
}
