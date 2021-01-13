package staticexamples;

public class StaticVariableExample {
	
	static {//other method of initializing static variable
	 int empId;
	 String empName;
	}
	static {
		System.out.println("first static block");
	}
	
	static {
		System.out.println("second static block");
	}
	StaticVariableExample(){
		
	}
	
	static void validate() {
	}
	

	 StaticVariableExample(int empId, String empName){
		//this.empId=empId;
		//this.empName=empName;//
		
		
		
	}//end of constructor
	
	static void display(int empId, String empName) {
		System.out.println("Employee id is: "+empId);
		System.out.println("Employee name is: "+empName);
		validate();
		
	}
	
	
}