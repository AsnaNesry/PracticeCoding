package enumexample;

public class EnumExample2 {
	public enum season {
		WINTER, SPRING, SUMMER, FALL
	}

	public static void main(String[] args) {
		season s = season.WINTER;
		System.out.println(s);

	}

}
