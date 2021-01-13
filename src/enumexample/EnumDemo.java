package enumexample;

public class EnumDemo {

	public static void main(String[] args) {
		for (Zodiac z : Zodiac.values()) {
			System.out.println(z.ordinal());

		}

		Zodiac z2 = Zodiac.SAGITTARIUS;
		Zodiac z3 = Zodiac.GEMINI;
		Zodiac z4 = Zodiac.ARIES;

		if (z2.compareTo(z3) == 0)
			System.out.println(z3 + " same as " + z2);
		else if (z4.compareTo(z2) < 0)
			System.out.println(z2 + " comes after " + z4);
		else
			System.out.println(z3 + " comes before " + z2);

	}

}
