package ornek1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Kitap {
	private int yil;
	private String adi;

	public Kitap(String adi) {
		this.adi = adi;
	}

	public Kitap(String adi, int yil) {
		this(adi);
		this.yil = yil;
	}
}
