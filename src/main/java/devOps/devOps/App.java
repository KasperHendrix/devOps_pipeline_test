package devOps.devOps;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		String hw = "Pasq";
		getMessage(hw);
	}

	public static String getMessage(String hw) {
		StringBuilder result = new StringBuilder();

		if (hw == null || hw.trim().length() == 0) {

			result.append("Please provide a name!");

		} else {

			result.append("Hello " + hw);

		}
		return result.toString();
	}
}
