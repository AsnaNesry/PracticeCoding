
public class OverLoadConstructors {

	int empId = 100;
	String empName = "XYZ";
	double empSal = 23500.56;

	private OverLoadConstructors() {
		empId = 101;
		empName = "UST";
		empSal = 12000.45d;
		System.out.println("inside default constructor......");
		System.out.println("Employee id is" + this.empId);
		System.out.println("Employee name is" + this.empName);
		System.out.println("Employee salary is" + this.empSal);
	}

	private OverLoadConstructors(int empId) {
		this();
		this.empId = empId;
		empName = "CTS";
		empSal = 65777.45d;
		System.out.println("inside single argument constructor......");
		System.out.println("Employee id is" + this.empId);
		System.out.println("Employee name is" + this.empName);
		System.out.println("Employee salary is" + this.empSal);
	}

	OverLoadConstructors(int empId, String name, double empSal) {
		this(empId);
		// this.empId = empId;
		empName = empName;
		empSal = empId;
		System.out.println("inside default constructor......");
		System.out.println("Employee id is" + this.empId);
		System.out.println("Employee name is" + this.empName);
		System.out.println("Employee salary is" + this.empSal);
	}

}
