package ornek6;

public abstract class BaseServlet implements Servlet {
	public abstract void get();

	@Override
	public void service() {
		System.out.println("Loglama yapılıyor.");
		get();
		System.out.println("Açık db connectionları kapatılıyor.");
	}

}
