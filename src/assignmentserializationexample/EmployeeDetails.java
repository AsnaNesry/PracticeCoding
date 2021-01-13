package assignmentserializationexample;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class EmployeeDetails {

	public String getFirstName() {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter first name: ");
		String firstname = sc.next();

		return firstname;

	}// end of method getfirstname

	public String getLastName() {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter last name: ");
		String lastname = sc.next();

		return lastname;

	}// end of method getlastname

	public int getAge() {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter age: ");
		int age = sc.nextInt();

		return age;
	}// end of method getAge

	public int getPassword() {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter  password: ");
		int password = sc.nextInt();

		return password;
	}// end of method getPassword

	void printDetails() {
		try (

				ObjectOutputStream objstream = new ObjectOutputStream(new FileOutputStream("D:\\Employee1.txt"))) {
			Employee1 obj1 = new Employee1();
			String firstname = getFirstName();
			String lastname = getLastName();
			int age = getAge();
			int password = getPassword();

			obj1.setFirstName(firstname);
			obj1.setLastName(lastname);
			obj1.setAge(age);
			obj1.setPassword(password);
			System.out.println("\n before serialization....");
			System.out.println(obj1);
			objstream.writeObject(obj1);

		} catch (IOException e) {
			System.out.println("Exception during serialization...........");

		}

	}
}
