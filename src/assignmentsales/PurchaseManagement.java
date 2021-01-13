package assignmentsales;

import java.util.List;
import java.util.Scanner;

public class PurchaseManagement {

	String actualUsername = "athira";
	String actualPassword = "athira1998";

	SalesManagement sm = new SalesManagement();
	ItemManagement itm = new ItemManagement();
	BankAccountManagement bms = new BankAccountManagement();
	BusinessManagement bm = new BusinessManagement();
	Scanner sc = new Scanner(System.in);

	public String getAdminUsername() {

		System.out.println("enter username: ");
		String username = sc.next();

		return username;

	}// end of method getUser

	public String getAdminPassword() {

		System.out.println("enter user password: ");
		String password = sc.next();

		return password;
	}// end of method getPassword

	public boolean validateUser() {
		boolean isValid = false;
		String username = getAdminUsername();
		String password = getAdminPassword();
		if (username.equals(actualUsername)) {
			if (password.equals(actualPassword)) {
				isValid = true;
				System.out.println("User Login Successful");
				System.out.println("Available Items");
				ItemManagement itemManagement = new ItemManagement();
				List<ItemDetails> itemList = itemManagement.loadItemDetails();
				itemManagement.displayItemList(itemList);
				System.out.println("0-->Pay Bill");

				Scanner sc = new Scanner(System.in);
				int menuChoice3 = sc.nextInt();
				int i = 0;

				switch (menuChoice3) {
				case 0:

					System.out.println("1) Login");
					System.out.println("2) New User");
					System.out.println("3) Exit");
					int menuChoice4 = sc.nextInt();
					switch (menuChoice4) {
					case 1:

						validateAccountPinNo();
						purchaseItem();

						break;
					case 2:
						bms.accountManage();
						System.out.println("Login with your Account number and pin number to purchase items");
						validateAccountPinNo();
						purchaseItem();
						break;
					case 3:
						System.exit(0);

					}
					break;
				}

			} // end of if
			else {
				System.out.println("Incorrect password");
				System.out.println("User Login Unsuccessful");
			}

		}

		else {
			System.out.println("Incorrect Username");
			System.out.println("User Login Unsuccessful");

		} // end of else
			// end of if
		return isValid;
	}// end of method validateUser

	public int getAccountNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Number: ");
		int accNo = sc.nextInt();

		return accNo;

	}// end of method getAccountNo

	public int getPinNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Pin Number: ");
		int pinNo = sc.nextInt();

		return pinNo;

	}// end of method getPinNo

	public void validateAccountPinNo() {
		int i = 1;
		boolean isValid = false;
		while ((i <= 3) && (isValid == false)) {

			int accountNumber = getAccountNo();
			int pinNumber = getPinNo();

			List<BankDetails> detailList = bms.loadAccountDetails();
			for (BankDetails details : detailList) {
				if (accountNumber == details.getAccountNo()) {
					if (pinNumber == details.getAccountPinNo()) {
						System.out.println("Successfully Loggedin");
						isValid = true;
						break;
					} // end of if
					else {
						System.out.println("invalid pin number");
						System.out.println("Login Unsuccessful");
						validateUser();

					} // end of else

				} // end of if
				else {

					System.out.println("Invalid Account number");
					System.out.println("Login Unsuccessful");

				} // end of else

			} // end of for loop
			i = i + 1;
		} // end of while loop
		if (isValid == false) {
			System.out.println("Maximum retries exceeded.");
			getLogin();
		} // end of if

	}

	public void getLogin() {
		int menuChoice5 = 0;
		System.out.println("create Account details in New User ");
		System.out.println("1) Login");
		System.out.println("2) New User");
		System.out.println("3) Exit");
		System.out.println("enter your choice: ");

		menuChoice5 = sc.nextInt();
		switch (menuChoice5) {

		case 1:

			validateAccountPinNo();

			break;
		case 2:
			bms.accountManage();

			break;
		case 3:
			System.exit(0);
		}

		bm.displayMainMenu();
	}

	public void purchaseItem() {
		List<ItemDetails> items = itm.loadItemDetails();
		Scanner sc = new Scanner(System.in);

		int itemPurchase = 0;
		int totalPrice = 0;
		int discount = 0;
		int netAmountCalculated = 0;
		System.out.println("how many items you need to purchase");
		itemPurchase = sc.nextInt();

		if (itemPurchase <= 3) {
			System.out.println("enter item Number");
			for (int i = 1; i <= itemPurchase; i++) {
				int itemNumber = sc.nextInt();

				for (ItemDetails item : items) {
					if (item.getItemNO() == itemNumber) {
						totalPrice += item.getItemPrice();
						discount += item.getItemPrice() * (20 / 100);
						netAmountCalculated += discount * (15 / 100);

					}
				}
			}

		} else {
			System.out.println("You can't buy more than 3 items");
		}
		System.out.println("Total Amount= " + totalPrice);

		if (totalPrice > 5000) {

			System.out.println("Discount on item price= " + discount);
			System.out.println("Net amount= " + netAmountCalculated);
			System.out.println();

		}

		else {
			System.out.println("Amount " + totalPrice + "deducted from your account");
			float accountBalance = 0;
			List<BankDetails> detailList = bms.loadAccountDetails();
			for (BankDetails details : detailList) {
				accountBalance = details.getBankAccountBalanceAmount();
			}
			if (accountBalance == 0) {
				System.out.println("Not enough balance in the account....");
			} else {
				System.out.println("Your account available balance is:" + (accountBalance - totalPrice));
			}
		}
		bm.displayMainMenu();
		sc.close();
	}

}
