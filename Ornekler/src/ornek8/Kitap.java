package ornek8;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Kitap implements Kiyaslanabilir {
	private int sayfaSayisi;

	public int kiyasla(Object obj) {
		Kitap kitap = (Kitap) obj;
		if (sayfaSayisi > kitap.sayfaSayisi) {
			return 1;
		} else if (sayfaSayisi < kitap.sayfaSayisi) {
			return -1;
		} else {
			return 0;
		}
	}
}
