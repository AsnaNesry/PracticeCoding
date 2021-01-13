package main;

public class MyFirstClass {

	public static void main(String[] args) {
		int var1=0;
		int var2=0;
		TestMethod tm = new TestMethod(234,451);
		int res = tm.calculateSum(var1,var2);
		System.out.println("Result is:" + res);
		//System.out.println(tm.calculateSum(var1,var2));
		

	}

}
