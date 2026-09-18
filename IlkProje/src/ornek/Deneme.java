package ornek;

public class Deneme {
	static int yas;

	public static void main(String[] args) {
		yas = 21;
		System.out.println("Merhaba");
		double a = 0.1;
		double b = 0.2;
		System.out.println(a + b);
		if (a + b == 0.3) {
			System.out.println("Eşit");
		} else {
			System.out.println("Eşit değil");
		}
		int c = 4;
		long d = 5_000_000_000L;
		c += 4;
		c++;
		c = 4;
		d = c++ + ++c;
		System.out.println(d);
		d = 3;
		d = d++;
		System.out.println(d);
		boolean f = 2 == 3;
		char g = 'a';
		g = '\n';
		System.out.println(f);
		System.out.println(g);
		int l = 010; // octal
		System.out.println(l);
		l = 0xFF; // hex
		System.out.println(l);
		l = 0b010; // binary
		System.out.println(l);
	}
}
