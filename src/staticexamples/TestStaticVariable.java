package staticexamples;

public class TestStaticVariable {

	public static void main(String[] args) {
	
		//StaticVariableExample sve = new StaticVariableExample(101,"Quest Global");//no need of creating objects if declared methods as static
		//sve.display();
		

		//StaticVariableExample sve1 = new StaticVariableExample(102,"Infosys");
		//sve1.display();
		
		StaticVariableExample.display(101,"infosys");//simply classname.method
		
	}

}
