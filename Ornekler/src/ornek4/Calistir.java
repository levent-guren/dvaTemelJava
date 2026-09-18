package ornek4;

public class Calistir {
	public static void main(String[] args) {
		Araba araba = new Araba();
		test(araba);
		Arac arac = new Arac();
		test(arac);
		Arac a = new Araba();
		System.out.println(a);
	}

	static void test(Arac arac) {
		System.out.println(arac.getHiz());
		if (arac instanceof Araba) {
			// String t = ((String) arac); // hata veriyor.
			System.out.println(((Araba) arac).getModel());
		}
	}
}
