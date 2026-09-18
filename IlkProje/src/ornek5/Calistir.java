package ornek5;

public class Calistir {
	public static void main(String[] args) {
		Deneme deneme = new Deneme();
		deneme.test(3);
		deneme.test(Integer.valueOf(5));
		deneme.test("Merhaba");
		deneme.test((String) null);
		deneme.test((Integer) null);
		deneme.test2("merhaba");
		deneme.test2("merhaba", 3);
		deneme.test2("merhaba", 8, 4, 3, 1, 6, 4);
	}
}
