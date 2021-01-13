package assignments;

public class TestUsernamePasswordException {

	public static void main(String[] args) {
		CheckUsernamePasswordExample.getdata();
		try {
			CheckUsernamePasswordExample.validateData();
		} // end of try
		catch (InvalidUsernameException1 | InvalidUsernameException2 | InvalidPasswordException e) {
			System.out.println(e);
		} // end of catch

	}// end of method

}// end of class
