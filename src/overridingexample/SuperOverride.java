package overridingexample;

 public class SuperOverride {
	SuperOverride(float arg1){
		System.out.println("inside superclass "+arg1);
		}
	void calculate(int arg1,float arg2,int arg3) {
		double res=(arg1*arg2)+arg3;
		System.out.println("Result is :"+res);
		
	}//end of method

}//end of class
