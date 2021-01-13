package formatter_scanner;

import java.util.Formatter;

public class FormatterExample1 {

	public static void main(String[] args) {
		Formatter fmt = new Formatter();
		fmt.format("%s ********** %d %s %f", "Infosys Mysore", 88, "Karnataka", 44.56);
		System.out.println(fmt.out());

	}

}
