package enumexample;

public class EnumExample3 {
	public enum Day_new {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}

	public static void main(String[] args) {
		Day_new day = Day_new.THURSDAY;

		switch (day) {
		case SUNDAY:
			System.out.println("Sunday");
			break;
		case MONDAY:
			System.out.println("Monday");
			break;
		case TUESDAY:
			System.out.println("Tuesday");
			break;
		case WEDNESDAY:
			System.out.println("Wednesday");
			break;
		case THURSDAY:
			System.out.println("Thursday");
			break;
		case FRIDAY:
			System.out.println("Friday");
			break;
		case SATURDAY:
			System.out.println("Saturday");
			break;
		}

	}

}
