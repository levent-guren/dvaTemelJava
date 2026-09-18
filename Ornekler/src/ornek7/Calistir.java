package ornek7;

public class Calistir {
	public static void main(String[] args) {
		int[] x = new int[3];
		x[0] = 5;
		System.out.println(x.toString());
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		System.out.println("------------");
		Cocuk[] cocuklar = new Cocuk[4];
		cocuklar[1] = new Cocuk();
		cocuklar[1].setYas(10);
		cocuklar[2] = cocuklar[1];
		for (int i = 0; i < cocuklar.length; i++) {
			System.out.println(cocuklar[i]);
		}
	}
}
