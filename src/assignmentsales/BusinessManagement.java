package assignmentsales;

import java.util.Scanner;

public class BusinessManagement {

	public static void main(String[] args) {
		BusinessManagement bm = new BusinessManagement();
		bm.displayMainMenu();
	}

	public void displayMainMenu() {

		PurchaseManagement pm = new PurchaseManagement();
		SalesManagement sm = new SalesManagement();

		System.out.println("1) Administrator");
		System.out.println("2) Customer");
		System.out.println("3) Exit");

		Scanner sc = new Scanner(System.in);
		System.out.println("Login as:");

		int menuChoice1 = sc.nextInt();
		boolean isValid = false;
		switch (menuChoice1) {
		case 1:

			isValid = sm.validateAdmin();
			if (!isValid) {
				displayMainMenu();
			}
			break;
		case 2:

			isValid = pm.validateUser();
			if (!isValid) {
				displayMainMenu();
			}
			break;
		case 3:
			System.out.println("You are sucessfully logged out....");
			System.exit(0);

		}// end of switch
	}
}
