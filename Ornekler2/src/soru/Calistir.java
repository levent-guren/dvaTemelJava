package soru;

import javax.management.RuntimeErrorException;

public class Calistir {
	public static void main(String[] args) {
		System.out.println(1);
		try {
			test(2);
		} catch (Exception e) {
			System.out.println(8);
		} finally {
			System.out.println(9);
		}
		System.out.println(3);
	}

	public static void test(int a) throws Exception {
		System.out.println(5);
		try {
			if (a == 2) {
				try {
					throw new RuntimeErrorException(null, "6");
				} finally {
					System.out.println(7);
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
	}
}
