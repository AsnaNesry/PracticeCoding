package arrays;

public class ArrayIncreaseSize {
	void increaseSizeofArray()
	{
		int array1[]= {10,20,30,40,50};
		System.out.println("contents of array before increasing size:");
		for(int incr=0;incr<array1.length;incr++) {
			System.out.println(array1[incr]+" ");
		}
		
		int temp[]=array1;
		array1= new int[10];
		System.out.println();
		System.out.println("contents of array after increasing size:");
		for(int incr=0;incr<array1.length;incr++) {
			System.out.println(array1[incr]+" ");
		}
		
		System.arraycopy(temp, 0, array1, 0, 5);
		System.out.println();
		System.out.println("contents of array after copying the content:");
		for(int incr=0;incr<array1.length;incr++) {
			System.out.println(array1[incr]+" ");
		}
	}

	

	public static void main(String[] args) {
		new ArrayIncreaseSize().increaseSizeofArray();

	}

}
