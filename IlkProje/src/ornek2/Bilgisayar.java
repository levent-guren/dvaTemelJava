package ornek2;

public class Bilgisayar extends Object {
	int ram;
	String marka;

	public Bilgisayar() {
		super();
	}

	public String toString() {
		// return "Ram: " + ram + ", Marka:" + marka;
		StringBuilder sb = new StringBuilder();
		sb.append("Ram: ");
		sb.append(ram);
		sb.append(", Marka:");
		sb.append(marka);
		return sb.toString();
	}
}
