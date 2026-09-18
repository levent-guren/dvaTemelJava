package ornek13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calistir {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			List<Integer> liste = new ArrayList<>();
			int sayi = 0;
			do {
				System.out.println("Bir sayı giriniz. (Bitirmek için 0 giriniz)");
				sayi = scanner.nextInt();
				if (sayi != 0) {
					liste.add(sayi);
				}
			} while (sayi != 0);
			liste.reversed().forEach(System.out::println);
		}
	}
}
