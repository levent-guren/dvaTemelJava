package ornek2;

public class Calistir {
	public static void main(String[] args) {
		Sayac sayac1 = new Sayac("s1");
		new Thread(sayac1).start();
		new Thread(sayac1).start();
		System.out.println("Program bitti");
	}
}
