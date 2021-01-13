package assignmentserializationexample;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class EmployeeValidate {
	String firstName;
	int password;

	public String getFirstName() {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter first name: ");
		String firstname = sc.next();

		return firstname;

	}// end of method getfirstname

	public int getPassword() {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter  password: ");
		int password = sc.nextInt();

		return password;
	}// end of method getPassword

	private Employee1 getEmployee() {
		Employee1 obj2 = null;
		try (ObjectInputStream objstream1 = new ObjectInputStream(new FileInputStream("D:\\Employee1.txt"))) {
			obj2 = (Employee1) objstream1.readObject();

		} catch (IOException | ClassNotFoundException cnf) {
			System.out.println("Exception during serialization..........");

		}
		return obj2;
	}

	public void validateUser() {
		firstName = getFirstName();
		password = getPassword();
		Employee1 obj2 = getEmployee();

		if (firstName.equals(obj2.getFirstName())) {
			if (password == obj2.getPassword()) {

				System.out.println("valid user");
			} else {
				System.out.println("invalid user");
			}
		}

		else {
			System.out.println("invalid user");
		}

	}

}
