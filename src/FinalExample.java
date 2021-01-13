
public class FinalExample extends FinalSuperClass {

	final int varConstant;
	 
	FinalExample(){
		varConstant=100;
		System.out.println("Example for final keyword");
		
	}
	void display() {
		System.out.println("you cannot override a method which is defined as final in super class");
		System.out.println("you cannot subclass a class wich is defined as final");
	}
	
	
	
}
