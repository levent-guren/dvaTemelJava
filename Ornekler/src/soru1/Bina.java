package soru1;

import lombok.Data;

@Data
public class Bina {
	static {
		System.out.println(13);
	}
	private int sokak;

	public Bina() {
		super();
		System.out.println(3);
	}

	public Bina(int sokak) {
		this();
		System.out.println(2);
		this.sokak = sokak;
	}

}
