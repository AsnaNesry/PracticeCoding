package arrays;

public class TestArrayCopyDemo {

	public static void main(String[] args) {
	
		char[] copyFrom = {'d','e','c','a','f','f','e','i','n','a','t','e','d'};

		char[] copyTo = new char[7];
		//char[] extended = new char[25];
		//extended[13]='g';
		//extended[14]='h';
		
		System.arraycopy(copyFrom, 4, copyTo, 0, 5);
		//System.arraycopy(copyFrom, 0, extended, 0, copyFrom.length);
		
		for(int incr=0;incr<copyTo.length;incr++) {
			
			System.out.println(copyTo[incr]);
		}

	}

}
