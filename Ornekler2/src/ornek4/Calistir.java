package ornek4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Calistir {
	public static void main(String[] args) throws Exception {
		textDosyaYaz();
		textDosyaYaz2();
		textDosyaOku();
		textDosyaOku2();
	}

	private static void textDosyaYaz() throws Exception {
		Path dosya = Path.of("nioDosya.txt");
		BufferedWriter writer = Files.newBufferedWriter(dosya, StandardCharsets.UTF_8);
		writer.write("Merhaba Dünya");
		writer.close();
	}

	private static void textDosyaYaz2() throws Exception {
		Path dosya = Path.of("nioDosya.txt");
		Files.writeString(dosya, "Merhaba Dünya2", StandardCharsets.UTF_8);
	}

	private static void textDosyaOku() throws Exception {
		Path dosya = Path.of("nioDosya.txt");
		BufferedReader reader = Files.newBufferedReader(dosya, StandardCharsets.UTF_8);
		String satir = reader.readLine();
		System.out.println("Okunan satir: " + satir);
		reader.close();
	}

	private static void textDosyaOku2() throws Exception {
		// dosya boyutumuz ufak ise kullanıyoruz
		Path dosya = Path.of("nioDosya.txt");
		System.out.println("Yeni ve kısa yöntemle okunuyor...");
		List<String> tumSatirlar = Files.readAllLines(dosya);
		tumSatirlar.forEach(System.out::println);

	}
}
