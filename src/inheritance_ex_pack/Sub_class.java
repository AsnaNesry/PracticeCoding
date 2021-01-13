package inheritance_ex_pack;

public class Sub_class extends Super_class {
	
	String name = "Infosys";
	Sub_class(){
		System.out.println("Inside subclass constructor ");
		
	}
	void display()
	{
		System.out.println(" name in sub class is "+name);
		System.out.println("Inside sub class.... ");
		
	}
	
	void call_method() {
		System.out.println("Name in sub class is "+ name);
		display(); 
		
		
	}
	

}
