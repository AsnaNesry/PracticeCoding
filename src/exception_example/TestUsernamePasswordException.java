package exception_example;

public class TestUsernamePasswordException {

	public static void main(String[] args) {
		CheckUsernamePasswordExample.getdata();
		try {
			CheckUsernamePasswordExample.validateData();
		} catch (UsernameCorrectException | PasswordCorrectException e) {
			System.out.println(e);
		}

	}

}
