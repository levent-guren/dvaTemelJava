package ornek14;

import java.util.ArrayList;
import java.util.List;

public class Calistir2 {
	public static void main(String[] args) {
		List<Integer> sayilar = new ArrayList<>();
		sayilar.add(3);
		sayilar.add(1);
		sayilar.add(2);
		sayilar.add(5);
		sayilar.add(6);
		sayilar.add(9);

		sayilar.stream().filter(s -> s > 4).forEach(System.out::println);
		System.out.println("--------------");
		sayilar.stream().filter(s -> {
			System.out.println("Filter:" + s);
			return true;
		}).forEach(s -> System.out.println("forEach:" + s));
	}
}
