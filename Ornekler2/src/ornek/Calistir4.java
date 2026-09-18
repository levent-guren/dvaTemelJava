package ornek;

public class Calistir4 {
	public static void main(String[] args) {
		try {
			test();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally2");
		}
		System.out.println("main");
	}

	private static void test() throws InterruptedException {
		System.out.println("teste girdi");
		try {
			int a = 5 / 0;
			System.out.println(a);
		} finally {
			System.out.println("finally");
		}
		System.out.println("test");
	}
}
