package soru1;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Otel extends Bina {
	static {
		System.out.println(12);
	}
	private String adi;

	public Otel(int sokak) {
		super(sokak);
		System.out.println("5");
	}

	public Otel(String adi) {
		this(8);
		System.out.println("7");
	}

}
