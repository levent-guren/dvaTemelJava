package ornek14;

import java.util.function.Consumer;

public class SayilariYaz implements Consumer<Integer> {
	@Override
	public void accept(Integer t) {
		System.out.println(t);
	}
}
