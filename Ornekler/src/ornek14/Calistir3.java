package ornek14;

import java.util.ArrayList;
import java.util.List;

public class Calistir3 {
	public static void main(String[] args) {
		List<String> isimler = new ArrayList<>();
		isimler.add("Ali");
		isimler.add("Murteza");
		isimler.add("Kazım");
		isimler.add("Vişne");
		isimler.add("Kamuran");
		isimler.add("Abdulmuttalip");
		int toplam = isimler.stream().map(s -> s.toUpperCase()).filter(s -> s.length() > 4).distinct()
				.mapToInt(s -> s.length()).sum();
		System.out.println(toplam);
	}
}
