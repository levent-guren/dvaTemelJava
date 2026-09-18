package ornek5;

public class Calistir2 {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		b.x();
		b.y();
		c.x();
		test(b);
		test(c);
	}

	public static void test(A a) {
		a.x();
	}
}
