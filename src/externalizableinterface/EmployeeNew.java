package externalizableinterface;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class EmployeeNew implements java.io.Externalizable {
	private int employeeId;
	private String employeeName;
	String department;
	String nationality;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public void readExternal(ObjectInput in) {
		System.out.println("reading data.....");
		try {
			employeeId = in.readInt();
			employeeName = (String) in.readObject();
			department = (String) in.readObject();
			nationality = (String) in.readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void writeExternal(ObjectOutput out) {
		try {
			out.writeInt(employeeId);
			out.writeObject(employeeName);
			out.writeObject(department);
			out.writeObject(nationality);
			System.out.println("written data.....");
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

	}
}
