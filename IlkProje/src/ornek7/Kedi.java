package ornek7;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Kedi extends Canli {
	private String adi;
	private int yas = 3;
}
