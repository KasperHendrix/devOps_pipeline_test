package devOps.devOps;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		String msg = "Pasq";
		getMessage(msg);
	}

	public static String getMessage(String msg) {
		StringBuilder result = new StringBuilder();

		if (msg == null || msg.trim().length() == 0) {

			result.append("Please provide a name!");

		} else {

			result.append("Hello " + msg);
		}
		return result.toString();
	}
}
