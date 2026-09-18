package ornek4;

public class Deneme {
	static int a = 3;
	static {
		System.out.println(4);
		a++;
	}
	int b = 2;

	public Deneme() {
		System.out.println(7);
		System.out.println(a);
		System.out.println(b);
		b = 7;
	}

	public int getB() {
		System.out.println(9);
		return b - 1;
	}
}
