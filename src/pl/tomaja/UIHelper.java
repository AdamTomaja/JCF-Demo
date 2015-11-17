package pl.tomaja;

/**
 * @author Adam Tomaja
 */
public class UIHelper {

	static void title(String title) {
		System.out.println(String.format("======= %s =======", title));
	}

	static void newline() {
		System.out.println();
	}

	static void show(String title, Object object) {
		System.out.println(String.format("%s:\t %s", title, object));
	}
}
