package ornek;

public class Calistir3 {
	public static void main(String[] args) {
		try {
			test();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main");
	}

	private static void test() throws InterruptedException {
		System.out.println("teste girdi");
		Thread.sleep(1000);
		System.out.println("test");
	}
}
