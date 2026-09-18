package ornek;

public class Calistir5 {
	public static void main(String[] args) throws Exception {
		try {
			test(3);
		} catch (NumberFormatException e) {
			System.out.println("exception yakalandı:" + e.getMessage());
			// throw new Exception("selam");
			throw e;
		}
		System.out.println("main");
	}

	private static void test(int sayi) {
		System.out.println("teste girdi");
		if (sayi < 5) {
			// hata ver
			throw new NumberFormatException("deneme");
		}
		System.out.println("test");
	}
}
