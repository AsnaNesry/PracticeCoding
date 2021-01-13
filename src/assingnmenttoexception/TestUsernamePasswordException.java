package assingnmenttoexception;

public class TestUsernamePasswordException {

	public static void main(String[] args) {
		CheckUsernamePasswordExample.getdata();
		try {
			CheckUsernamePasswordExample.validateData();
		} // end of try
		catch (InvalidUsernameException | InvalidPasswordException | ValidUsernamePasswordException e) {
			System.out.println(e);
		} // end of catch

	}// end of method

}// end of class
