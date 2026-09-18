package ornek9;

public class KitapKiyaslayici implements Kiyaslayici {

	@Override
	public int kiyasla(Object o1, Object o2) {
		Kitap k1 = (Kitap) o1;
		Kitap k2 = (Kitap) o2;

		if (k1.getSayfaSayisi() > k2.getSayfaSayisi()) {
			return 1;
		} else if (k1.getSayfaSayisi() < k2.getSayfaSayisi()) {
			return -1;
		} else {
			return 0;
		}
	}

}
