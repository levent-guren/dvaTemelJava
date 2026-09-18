package ornek10;

public class CocukKiyaslayici implements Kiyaslayici {

	@Override
	public int kiyasla(Object o1, Object o2) {
		Cocuk c1 = (Cocuk) o1;
		Cocuk c2 = (Cocuk) o2;

		if (c1.getYas() > c2.getYas()) {
			return 1;
		} else if (c1.getYas() < c2.getYas()) {
			return -1;
		} else {
			return 0;
		}
	}

}
