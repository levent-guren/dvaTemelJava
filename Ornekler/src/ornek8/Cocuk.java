package ornek8;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cocuk implements Kiyaslanabilir {
	private int yas;

	public int kiyasla(Object obj) {
		Cocuk cocuk = (Cocuk) obj;
		if (yas > cocuk.yas) {
			return 1;
		} else if (yas < cocuk.yas) {
			return -1;
		} else {
			return 0;
		}
	}
}
