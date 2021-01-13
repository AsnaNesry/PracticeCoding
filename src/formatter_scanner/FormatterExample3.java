package formatter_scanner;

import java.util.Arrays;
import java.util.List;

public class FormatterExample3 {

	public static void main(String[] args) {

		String[] str = { "Head first java", "Effective java", "The passionate programmer",
				"Head first design patterns" };

		List<String> listBook = Arrays.asList(str);

		for (String book : listBook) {
			System.out.printf("%-30s - In stock %10d %n", book, 245);
		}

	}

}
