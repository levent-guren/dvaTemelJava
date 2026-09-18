package ornek4;

public class Calistir {
	public static void main(String[] args) {
		Sayac sayac = new Sayac();
		new Thread(sayac).start();
		new Thread(sayac).start();
		Sayac.bekle(2000);
		System.out.println("Program bitti " + Sayac.sayi);
	}
}
