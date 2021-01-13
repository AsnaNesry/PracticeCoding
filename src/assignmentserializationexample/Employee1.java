package assignmentserializationexample;

public class Employee1 implements java.io.Serializable {

	private String firstName = null;
	private String lastName = null;
	private int age = 0;
	private int password = 0;

	public Employee1() {

		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.password = password;

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String toString() {
		return "\nFirst Name is:-" + firstName + "\n Last Name is:- " + lastName + "\nAge is:-" + age
				+ "\n Password is:-" + password;
	}

}
