package ornek;

@SuppressWarnings("deprecation")
public class Calistir {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {

		}
		int i = 10;
		while (i > 0) {
			i--;
		}

		do {
			i++;
		} while (i < 10);

		switch (i) {
		case 1: {
			System.out.println("bir");
			break;
		}
		case 2: {
			System.out.println("iki");
			break;
		}
		default:
			System.out.println("1 veya 2 değil");
		}
		String s = new String("Ali");
		String s2 = s.toLowerCase();
		System.out.println(s);
		System.out.println(s2);
		s = "Ali";

		s2 = "Ali";
		if (s == s2) {
			System.out.println("Eşit");
		} else {
			System.out.println("Eşit Değil");
		}
		s = "Ali";

		s2 = "A" + "li";
		if (s == s2) {
			System.out.println("Eşit");
		} else {
			System.out.println("Eşit Değil");
		}
		s = "Ali";

		s2 = new String("Ali");
		if (s == s2) {
			System.out.println("Eşit");
		} else {
			System.out.println("Eşit Değil");
		}
		if (s.equals(s2)) {
			System.out.println("Eşit");
		}
		Double d = new Double(2.3);
		System.out.println(d.doubleValue());
		d = Double.valueOf(2.3);
		d.intValue();
		Double.parseDouble("2.3");
		d = 3.2;
		Double d2 = 2.1;
		Double d3 = d + d2;
		System.out.println(d3);
	}

}
