package ornek14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Calistir4 {
	public static void main(String[] args) {
		Set<Integer> sayilar = new HashSet<>();
		sayilar.add(1);
		sayilar.add(3);
		sayilar.add(5);
		sayilar.add(1);
		sayilar.add(5);
		sayilar.add(7);
		Iterator<Integer> itr = sayilar.iterator();
		while (itr.hasNext()) {
			int s = itr.next();
			System.out.println(s);
		}
		//
		for (int i : sayilar) {
			System.out.println(i);
		}
		//
		sayilar.forEach(System.out::println);
	}
}
