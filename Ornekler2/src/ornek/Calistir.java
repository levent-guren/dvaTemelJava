package ornek;

public class Calistir {
	public static void main(String[] args) {
		test();
		System.out.println("main");
	}

	private static void test() {
		try {
			int a = 3 / 0;
			System.out.println(a);
		} catch (ArithmeticException e) {
			System.out.println("yakalandı");
		}
		System.out.println("test");
	}
}
