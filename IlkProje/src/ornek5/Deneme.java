package ornek5;

public class Deneme {
	void test(int x) {
		System.out.println(x);
	}

	void test(String y) {
		System.out.println("String:" + y);
	}

	void test(Integer y) {
		System.out.println("Integer:" + y);
	}

	void test(int x, int y) {
		System.out.println(x + y);
	}

	void test2(String a, int... b) {
		System.out.println(b.length);
		if (b.length > 0) {
			System.out.println(b[0]);
		}
	}
}
