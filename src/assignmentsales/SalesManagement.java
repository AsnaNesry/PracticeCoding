package assignmentsales;

import java.util.List;
import java.util.Scanner;

public class SalesManagement {

	String actualadminUsername = "asna";
	String actualadminPassword = "asna1997";
	Scanner sc = new Scanner(System.in);

	public String getUsername() {

		System.out.println("Enter Admin username: ");
		String username = sc.next();

		return username;

	}// end of method getUser

	public String getPassword() {

		System.out.println("Enter Admin password: ");
		String password = sc.next();

		return password;
	}// end of method getPassword

	public boolean validateAdmin() {

		String username = getUsername();
		String password = getPassword();
		boolean isValid = false;
		if (username.equals(actualadminUsername)) {
			if (password.equals(actualadminPassword)) {
				System.out.println("Admin Login Successful");
				isValid = true;
				displayAdminMenu();
			} // end of if
			else {
				System.out.println("Incorrect Admin Password");
				System.out.println("Admin Login Unsuccessful");
			}

		} // end of if

		else {
			System.out.println("Incorrect Admin Username");
			System.out.println("Admin Login Unsuccessful");
		}
		return isValid;
		// end of else
	}// end of method validateAdmin

	public void displayAdminMenu() {

		System.out.println("1) Add items");
		System.out.println("2) Modify items");
		System.out.println("3) Delete Items");
		System.out.println("4) Exit");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your choice: ");
		int menuChoice2 = sc.nextInt();

		switch (menuChoice2) {
		case 1:
			ItemManagement itemManagement = new ItemManagement();
			List<ItemDetails> itemList = itemManagement.addItem();
			itemManagement.displayItemList(itemList);
			itemManagement.saveItemDetails(itemList);
			displayAdminMenu();
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			System.exit(0);
			break;

		}// end of switch
	}// end of method getPermission

}
