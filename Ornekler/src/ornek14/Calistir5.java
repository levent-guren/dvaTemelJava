package ornek14;

import java.util.HashMap;
import java.util.Map;

public class Calistir5 {
	public static void main(String[] args) {
		Map<Integer, String> sehirler = new HashMap<>();
		sehirler.put(1, "Adana");
		sehirler.put(6, "Ankara");
		sehirler.put(34, "İstanbul");
		sehirler.put(7, "Antalya");
		sehirler.put(6, "Alanya");
		System.out.println(sehirler.get(6));
	}
}
