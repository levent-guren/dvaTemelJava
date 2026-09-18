package ornek;

public class Calistir2 {
	public static void main(String[] args) {
		try {
			test();
		} catch (ArithmeticException e) {
			System.out.println("yakalandı");
		}
		System.out.println("main");
	}

	private static void test() {
		int a = 3 / 0;
		System.out.println(a);
		System.out.println("test");
	}
}
