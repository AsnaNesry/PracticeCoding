package main;

public class LoopExample {
	
	
	void whileTest()
	
	{  System.out.println("inside while loop");
		int var1 = 1;
		while (var1<10) {
			System.out.println(var1);
			var1++;
		}
	}
		
	void doWhileTest() {
		System.out.println("inside dowhile");
		int var1=1;
		do {
		System.out.println(var1);
		var1++;
	}while (var1<10);
	}
		
	void forTest() {
		System.out.println("inside forloop");
		
		for(int var1=0; var1<10; var1++) {
			System.out.println(var1);
		}
	}
	

	public static void main(String[] args) {
		LoopExample lp = new LoopExample();
		lp.whileTest();
		lp.doWhileTest();
		lp.forTest();

	}

}
