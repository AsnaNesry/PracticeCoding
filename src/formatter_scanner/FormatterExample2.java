package formatter_scanner;

import java.util.Formatter;

public class FormatterExample2 {

	public static void main(String[] args) {
		Formatter fmt = new Formatter();
		fmt.format("infosys interview screening.....%n MCA cotoff percentage is %d%%", 75);
		System.out.println(fmt);
	}

}
