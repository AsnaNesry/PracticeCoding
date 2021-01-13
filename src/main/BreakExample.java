package main;

public class BreakExample {
	void breakkMethod() {
		for(int incr=1;incr<=10;incr++) {
			if(incr==5) {
				//break;
				continue;
			}
			System.out.println(incr);
		}
	}

	public static void main(String[] args) {
		
		BreakExample be = new BreakExample();
		be.breakkMethod();
		

	}

}
