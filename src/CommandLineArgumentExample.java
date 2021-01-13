
public class CommandLineArgumentExample {

	public static void main(String[] args) {

		int var1 = Integer.parseInt(args[0]);
		int var2 = Integer.parseInt(args[1]);
		float var3 = Float.parseFloat(args[2]);
		double res = var1 + var2 + var3;
		System.out.println("Result is " + res);

	}// end of main
}// end of class
