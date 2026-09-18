package ornek3;

public class Calistir {
	public static void main(String[] args) {
		var ogrenci = new Ogrenci();
		var ogrenci2 = new Ogrenci();
		System.out.println(ogrenci.yas);
		System.out.println(Ogrenci.okul);
		System.out.println(ogrenci2.yas);
		System.out.println(Ogrenci.okul);
		ogrenci.yas = 30;
		ogrenci2.yas = 40;
		Ogrenci.okul = "Mustafa Kemal";
		System.out.println("--------");
		System.out.println(ogrenci.yas);
		System.out.println(Ogrenci.okul);
		System.out.println(ogrenci2.yas);
		System.out.println(Ogrenci.okul);

	}
}
