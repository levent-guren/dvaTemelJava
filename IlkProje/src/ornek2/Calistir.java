package ornek2;

public class Calistir {
	public static void main(String[] args) {
		Bilgisayar bilgisayar = new Bilgisayar();
		bilgisayar.ram = 2048;
		bilgisayar.marka = "Acer";
		System.out.println(bilgisayar.ram);
		System.out.println(bilgisayar.marka);
		System.out.println(bilgisayar);
	}
}
