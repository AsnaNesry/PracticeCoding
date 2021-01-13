package formatter_scanner;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatterExample_5 {

	static void localeFormatterNonIndian() {
		long k = 1000;
		long m = 1000000;
		long t = 1000000000;

		System.out.println("French locale:");
		System.out.format(Locale.FRENCH, "one thousand: %,d%n", k);
		System.out.format(Locale.FRENCH, "one million: %,d%n", m);
		System.out.format(Locale.FRENCH, "one billion: %,d%n", t);

		System.out.println("German locale:");
		System.out.format(Locale.GERMAN, "one thousand: %,d%n", k);
		System.out.format(Locale.GERMAN, "one million: %,d%n", m);
		System.out.format(Locale.GERMAN, "one billion: %,d%n", t);

		System.out.println("Indian locale:");
		System.out.format(Locale.getDefault(), "one thousand: %,d%n", k);
		System.out.format(Locale.getDefault(), "one million: %,d%n", m);
		System.out.format(Locale.getDefault(), "one billion: %,d%n", t);

		System.out.println("Default locale:Indian");
		System.out.format("one thousand: %,d%n", k);
		System.out.format("one million: %,d%n", m);
		System.out.format("one billion: %,d%n", t);
	}

	static void localeFormatterIndian() {
		long k = 1000;
		long m = 1000000;
		long t = 1000000000;

		NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		String moneyString = formatter.format(k);
		String moneyString1 = formatter.format(m);
		String moneyString2 = formatter.format(t);

		System.out.println("one thousand:" + moneyString);
		System.out.println("one million:" + moneyString1);
		System.out.println("one billion:" + moneyString2);

	}

	public static void main(String[] args) {
		localeFormatterNonIndian();
		System.out.println("**********************************************");
		localeFormatterIndian();

	}

}
