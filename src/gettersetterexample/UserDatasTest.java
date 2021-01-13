package gettersetterexample;

import java.util.Scanner;

public class UserDatasTest {

	int actualUserid = 1024;
	int actualuserpin = 23;

	public int getUserId() {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter user id: ");
		int id = sc.nextInt();

		return id;

	}// end of method getId

	public int getUserpin() {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter user pin: ");
		int pin = sc.nextInt();

		return pin;
	}// end of method getuserPin

	public void validateUser() {
		int userid = getUserId();
		int userpin = getUserpin();
		UserDatas ud = new UserDatas();
		ud.setUserid(userid);
		ud.setUserpin(userpin);

		if (ud.getUserid() == actualUserid) {
			if (ud.getUserpin() == actualuserpin) {
				System.out.println("valid user");

			} // end of if

		} // end of if
		else {
			System.out.println("invalid user");

		}

		// end of else
	}// end of method validateAdmin
}
