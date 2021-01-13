package overridingexample;

public class SubOverride extends SuperOverride {
	SubOverride(){
		super(36.6f);
		System.out.println("inside subclass constructor");
		//System.out.println("");
		
	}
	
	void calculate(int arg1,float arg2) {
		int var1= arg1+10;
		float var2=arg2*2;
		double res=(var1+var2)*10;
		System.out.println("Result is :"+res);
		super.calculate(20, 10.5f, 5);
	}//end of method


}//end of class


