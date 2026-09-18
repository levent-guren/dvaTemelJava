package ornek8;

public class Calistir {
	public static void main(String[] args) {
		Cocuk[] cocuklar = { new Cocuk(5), new Cocuk(3), new Cocuk(8) };
		sirala(cocuklar);
		for (Cocuk cocuk : cocuklar) {
			System.out.println(cocuk);
		}
		Kitap[] kitaplar = { new Kitap(300), new Kitap(150), new Kitap(800), new Kitap(30) };
		sirala(kitaplar);
		for (Kitap kitap : kitaplar) {
			System.out.println(kitap);
		}
	}

	private static void sirala(Kiyaslanabilir[] dizi) {
		for (int i = 0; i < dizi.length; i++) {
			for (int y = i + 1; y < dizi.length; y++) {
				if (dizi[i].kiyasla(dizi[y]) > 0) {
					// yer değiştir
					Kiyaslanabilir t = dizi[i];
					dizi[i] = dizi[y];
					dizi[y] = t;
				}
			}
		}
	}
}
