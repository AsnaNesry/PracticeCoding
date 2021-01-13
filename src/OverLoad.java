
public class OverLoad {
 
	int var1=100;
	float varf=23.5f;
	String name="asna";
	
	
	void calculateSum(int arg1, int arg2) {
		long result=arg1*arg2;
		System.out.println("argument1= "+arg1);
		System.out.println("argument2= "+arg2);
		System.out.println("result= "+result);
		
	}
	
	void calculateSum(int arg1, float arg2) {
		double result=arg1+arg2;
		System.out.println("argument1= "+arg1);
		System.out.println("argument2= "+arg2);
		System.out.println("result= "+result);
		
		
	}
	
	void calculateSum(int arg1, int arg2,float arg3) {
		double result=(arg1*arg2)+arg3;
		System.out.println("argument1= "+arg1);
		System.out.println("argument2= "+arg2);
		System.out.println("argument2= "+arg3);
		System.out.println("result= "+result);
		
		
	}
}
