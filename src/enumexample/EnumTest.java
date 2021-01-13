package enumexample;

public class EnumTest {

	public Day day;

	public EnumTest(Day day) {
		this.day = day;
	}

	public void tellItLikeItIs() {

		switch (day) {
		case MONDAY:
			System.out.println("Mondays are bad");
			break;
		case FRIDAY:
			System.out.println("Fridays are better");
			break;
		case SATURDAY:
			System.out.println("Weekends are best");
			break;
		default:
			System.out.println("mid week days are so-so..");
		}

	}

	public static void main(String[] args) {
		EnumTest fristDay = new EnumTest(Day.MONDAY);
		fristDay.tellItLikeItIs();
		EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
		thirdDay.tellItLikeItIs();
		EnumTest fifthDay = new EnumTest(Day.FRIDAY);
		fifthDay.tellItLikeItIs();
		EnumTest sixthDay = new EnumTest(Day.SATURDAY);
		sixthDay.tellItLikeItIs();
		EnumTest seventhDay = new EnumTest(Day.SUNDAY);
		seventhDay.tellItLikeItIs();

	}

}
