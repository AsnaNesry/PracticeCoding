package misc_programs_java;

public class EnhancedForLoopExample {

	public static void main(String[] args) {

		int[] numbers = { 1, 4, 5, 7, 8 };
		for (int var1 : numbers) {
			System.out.println(var1);
			System.out.println(" ");
		}

		String[] names = { "Athira", "Asna", "Afifa", "Aswathy" };
		for (String name : names) {
			System.out.println(name);
			System.out.println(" ");
		}

	}

}
