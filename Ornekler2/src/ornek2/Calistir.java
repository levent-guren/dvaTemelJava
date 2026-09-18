package ornek2;

import java.util.ArrayList;
import java.util.List;

public class Calistir {
	public static void main(String[] args) {
		List<String> isimler = new ArrayList<String>();
		isimler.add("Kamile");
		// test(isimler);
		List<Number> sayilar = new ArrayList<>();
		sayilar.add(3);
		test(sayilar);
		List<Double> sayilar2 = new ArrayList<>();
		sayilar.add(3.2);
		test(sayilar2);
	}

	private static void test(List<? extends Number> dizi) {
		// dizi.add(5.3); hata veriyor.
	}
}
