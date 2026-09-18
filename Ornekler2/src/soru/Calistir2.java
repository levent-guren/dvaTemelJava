package soru;

import javax.management.RuntimeErrorException;

public class Calistir2 {
	public static void main(String[] args) {
		try {
			test();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void test() throws Exception {
		try {
			throw new RuntimeErrorException(null, "6");
		} finally {
			try {
				throw new RuntimeErrorException(null, "7");
			} catch (Exception e) {
				System.out.println(e.getMessage());
				try {
					throw new RuntimeErrorException(null, "8");
				} catch (Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
		}
	}
}
