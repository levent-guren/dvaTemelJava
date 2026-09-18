package ornek7;

public class Calistir {
	public static void main(String[] args) {
		Kedi kedi = new Kedi();
		kedi.setAdi("Mercan");
		kedi.setYas(4);
		System.out.println(kedi);
		System.out.println(kedi.getYas());
		// Canli canli = new Canli();
		// canli = new Kedi();
		Canli canli = kedi;
		System.out.println(canli.getYas());
		System.out.println(canli);
	}
}
