package ornek7;

public class Calistir2 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int[][] s = new int[3][];
		s[0] = new int[2];
		s[1] = new int[3];
		s[2] = s[0];
		s[0][1] = 3;
		s[2][0] = 4;
		for (int i = 0; i < s[0].length; i++) {
			System.out.println(s[0][i]);
		}
		s = new int[3][2];
		int[] s2 = new int[] { 2, 3, 5, 8 };
		int[] s3 = { 2, 3, 5, 8 };
		s3 = new int[] { 2, 3, 5, 8 };
		var s4 = new int[] { 2 };
		int[][] s5 = { { 1, 2 }, { 3 }, { 4, 5, 6 } };
		Cocuk[] c = { new Cocuk(), new Cocuk() };
		///// ödev:
		int[] sayilar = new int[100];
		for (int i = 1; i <= 100; i++) {
			sayilar[i - 1] = i;
		}
	}
}
