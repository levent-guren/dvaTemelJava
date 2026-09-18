package ornek6;

public class Calistir {
	public static void main(String[] args) {
		Kedi kedi = new Kedi();
		kedi.adi = "Mercan";
		kedi.yas = 4;
		System.out.println(kedi);
		System.out.println(kedi.yas);
		// Canli canli = new Canli();
		// canli = new Kedi();
		Canli canli = kedi;
		System.out.println(canli.yas);
		System.out.println(canli);
	}
}
