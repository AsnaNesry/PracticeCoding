package formatter_scanner;

public class FormatterExample_6 {

	static void stringFormatter() {
		String specifiers = "%-30s %-20s %-5.3f%n";
		String specifiers_s = "30s %-20s %-20s%n";

		System.out.printf(specifiers_s, "Book Title", "Book Author", "Bokk Price");
		System.out.format(specifiers_s, "============", "============", "============");
		System.out.format(specifiers, "Head First Java", "Kathy Sierra", 234.99f);
		System.out.format(specifiers, "Thinking In Java", "Bruce Eckel", 300.69f);
		System.out.format(specifiers, "Effective Java", "Joshua Bloch", 756.88f);
		System.out.format(specifiers, "The Passionate Programmer", "Chad Fowler", 410.99f);
		System.out.format(specifiers, "Code Complete", "Steve McConnell", 388.42f);

	}

	static void stringFormatter_1() {
		System.out.format("%20s %s %n", "Full Name: ", "Asna");
		System.out.format("%20s %s %n", "Email Address: ", "asnanesry@gmail.com");
		System.out.format("%20s %s %n", "City: ", "Kerala");
		System.out.format("%20s %s %n", "Country: ", "India");

	}

	public static void main(String[] args) {
		stringFormatter();
		System.out.println("#################################################");
		stringFormatter_1();

	}

}
