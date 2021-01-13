package serializationexample;

public class Employee implements java.io.Serializable {
	private transient String firstName = null;
	private String lastName = null;
	private int age = 0;

	public Employee(String firstName, String lastName, int age) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
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

	public String toString() {
		return "\nFirst Name is:-" + firstName + "\n Last Name is:- " + lastName + "\nAge is:-" + age;
	}

}
