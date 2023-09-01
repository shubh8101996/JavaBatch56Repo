package abc;

public class SwitchCase {

	public static void main(String[] args) {

		String browser = "chrome";

		switch (browser) {

		case "chrome":
			System.out.println("chrome browser is opened");
			break;

		case "firefox":
			System.out.println("firefox browser is opened");
			break;

		case "edge":
			System.out.println("edge browser is opened");
			break;

		case "safari":
			System.out.println("safari browser is opened");
			break;

		default:
			System.out.println("wrong browser value");
			break;
		}

	}

}
