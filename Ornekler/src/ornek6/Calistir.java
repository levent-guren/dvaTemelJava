package ornek6;

public class Calistir {
	public static void main(String[] args) {
		String url = "/login";
		webExecute(url);
	}

	private static void webExecute(String url) {
		Servlet servlet = null;
		if (url.startsWith("/login")) {
			servlet = new LoginServlet();
		} else if (url.startsWith("/logout")) {
			servlet = new LogoutServlet();
		}
		servlet.service();
	}
}
