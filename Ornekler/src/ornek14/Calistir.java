package ornek14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Calistir {
	public static void main(String[] args) {
		List<Integer> sayilar = new ArrayList<>();
		sayilar.add(3);
		sayilar.add(1);
		sayilar.add(2);
		sayilar.add(5);
		sayilar.add(6);
		sayilar.add(9);
		sayilar.stream().forEach(new SayilariYaz());
		System.out.println("------------------");
		sayilar.stream().forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		});
		System.out.println("------------------");
		sayilar.stream().forEach(t -> System.out.println(t));
		System.out.println("------------------");
		sayilar.stream().forEach(System.out::println);
		System.out.println("------------------");
		sayilar.stream().forEach(Calistir::yaz);
		System.out.println("------------------");
	}

	public static void yaz(int a) {
		System.out.println(a);
	}
}
