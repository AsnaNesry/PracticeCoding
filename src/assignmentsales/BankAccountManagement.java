package assignmentsales;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankAccountManagement {
	BankDetails bd = new BankDetails();
	SalesManagement sm = new SalesManagement();
	BusinessManagement bm = new BusinessManagement();

	public List<BankDetails> accountManage() {
		List<BankDetails> accountList = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Details");
		System.out.println("Account Nnumber    Account pin Number    BalanceAmount");

		bd.setAccountNo(sc.nextInt());
		bd.setAccountPinNo(sc.nextInt());
		bd.setBankAccountBalanceAmount(sc.nextFloat());
		if (validateDigit() == true) {
			accountList.add(bd);
			saveAccountDetails(accountList);
		}

		else {

			System.out.println("Try with a new Account number and Pin");
			bm.displayMainMenu();
		}

		return accountList;

	}

	public boolean validateDigit() {
		boolean isValid = false;

		if ((bd.getAccountNo() > 0) && (bd.getAccountPinNo() > 0)) {
			String accNo = String.valueOf(bd.getAccountNo());
			String accPin = String.valueOf(bd.getAccountPinNo());
			if (accNo.length() == 10) {
				if (accPin.length() == 4) {
					isValid = true;

				} else {
					System.out.println("Pin Number must be of 4 digits");
				}

			} else {
				System.out.println("Account number must be of 10 digits");
			}
		}
		return isValid;
	}

	public void saveAccountDetails(List<BankDetails> accountList) {
		try (ObjectOutputStream objstream = new ObjectOutputStream(new FileOutputStream("D:\\Account.txt"))) {
			objstream.writeObject(accountList);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<BankDetails> loadAccountDetails() {
		List<BankDetails> accountList = null;
		try (ObjectInputStream objstream1 = new ObjectInputStream(new FileInputStream("D:\\Account.txt"))) {
			accountList = (List<BankDetails>) objstream1.readObject();

		} catch (IOException | ClassNotFoundException cnf) {
			System.out.println("Exception during serialization..........");

		}
		return accountList;
	}

}
