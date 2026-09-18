package ornek5;

public class Calistir {
	public static void main(String[] args) {
		B b = new B();
		F f = new F();
		b.x();
		b.y();
		f.x();
		f.y();
		test(b);
		test(f);
	}

	public static void test(B b) {
		b.x();
		b.y();
	}
}
