package ornek3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class Calistir {
	public static void main(String[] args) throws Exception {
		binaryDosyaYaz();
		binaryDosyaOku();
		textDosyaYaz();
		textDosyaOku();
	}

	private static void textDosyaYaz() throws Exception {
		File file = new File("oku.txt");
		FileOutputStream fos = new FileOutputStream(file);
		OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
		BufferedWriter writer = new BufferedWriter(osw);
		writer.write("Merhaba Dünya");
		writer.close();
		osw.close();
		fos.close();
	}

	private static void textDosyaOku() throws Exception {
		File file = new File("oku.txt");
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
		BufferedReader reader = new BufferedReader(isr);
		String satir = reader.readLine();
		System.out.println("Text dosya okunan satır: " + satir);
		reader.close();
		isr.close();
		fis.close();
	}

	private static void binaryDosyaYaz() throws Exception {
		File file = new File("oku.bin");
		FileOutputStream fos = new FileOutputStream(file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		bos.write(new byte[] { 12, 2, 3, 4 });
		bos.close();
		fos.close();
	}

	private static void binaryDosyaOku() throws Exception {
		File file = new File("oku.bin");
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		byte[] bytes = new byte[255];

		int readByteCount = bis.read(bytes, 0, 255);
		System.out.println(readByteCount);
		System.out.println("ilk byte:" + bytes[0]);
		bis.close();
		fis.close();
	}

}
