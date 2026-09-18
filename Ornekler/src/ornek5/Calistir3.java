package ornek5;

public class Calistir3 {
	public static void main(String[] args) {
		B b = new B();
		D d = new D();
		b.x();
		b.y();
		d.x();
		d.y();
		test(b);
		test(d);
		test(new F());
	}

	public static void test(Ortak x) {
		x.x();
		x.y();
	}
}
