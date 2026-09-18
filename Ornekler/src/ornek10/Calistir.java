package ornek10;

public class Calistir {
	public static void main(String[] args) {
		Cocuk[] cocuklar = { new Cocuk(5, 110), new Cocuk(3, 130), new Cocuk(8, 90) };
		sirala(cocuklar, new CocukKiyaslayici());
		for (Cocuk cocuk : cocuklar) {
			System.out.println(cocuk);
		}
		System.out.println("--------------");
		sirala(cocuklar, new CocukKiyaslayiciBoy());
		for (Cocuk cocuk : cocuklar) {
			System.out.println(cocuk);
		}
		System.out.println("--------------");
		Kitap[] kitaplar = { new Kitap(300), new Kitap(150), new Kitap(800), new Kitap(30) };
		sirala(kitaplar, new KitapKiyaslayici());
		for (Kitap kitap : kitaplar) {
			System.out.println(kitap);
		}
	}

	private static void sirala(Object[] dizi, Kiyaslayici kiyaslayici) {
		for (int i = 0; i < dizi.length; i++) {
			for (int y = i + 1; y < dizi.length; y++) {
				if (kiyaslayici.kiyasla(dizi[i], dizi[y]) > 0) {
					// yer değiştir
					Object t = dizi[i];
					dizi[i] = dizi[y];
					dizi[y] = t;
				}
			}
		}
	}
}
