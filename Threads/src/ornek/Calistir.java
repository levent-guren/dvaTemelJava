package ornek;

public class Calistir {
	public static void main(String[] args) {
		Sayac sayac1 = new Sayac("s1");
		Sayac sayac2 = new Sayac("s2");
		sayac1.start();
		Sayac.bekle(20);
		sayac2.start();
		System.out.println("Program bitti");
	}
}
