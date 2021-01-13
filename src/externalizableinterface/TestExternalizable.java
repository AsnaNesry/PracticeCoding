package externalizableinterface;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestExternalizable {

	public static void main(String[] args) {
		EmployeeNew emp = new EmployeeNew();
		emp.setEmployeeId(1028271);
		emp.setEmployeeName("Asna");
		emp.setDepartment("B-Tech");
		emp.setNationality("Indian");

		try {
			FileOutputStream fileOut = new FileOutputStream("D:\\employeenew.txt");
			ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
			outStream.writeObject(emp);
			outStream.close();
			fileOut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		emp = null;
		try {
			FileInputStream fileIn = new FileInputStream("D:\\employeenew.txt");
			ObjectInputStream inStream = new ObjectInputStream(fileIn);
			emp = (EmployeeNew) inStream.readObject();
			inStream.close();
			fileIn.close();
		} catch (IOException e) {
			e.printStackTrace();

			return;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("employee class not found...");
			return;
		}
		System.out.println("Deserialized Employee...");
		System.out.println("Employee Id: " + emp.getEmployeeId());
		System.out.println("Employee Name: " + emp.getEmployeeName());
		System.out.println("Employee Department: " + emp.getDepartment());
		System.out.println("Employee Nationality: " + emp.getNationality());

	}

}
