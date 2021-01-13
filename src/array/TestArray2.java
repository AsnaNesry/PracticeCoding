package array;

public class TestArray2 {
	void min(int arr[]) {
		int min=arr[0];
		for(int incr=1;incr<arr.length;incr++) {
			if(min>arr[incr]) {
				min=arr[incr];
			}
		}
		System.out.println(min);
	}

	public static void main(String[] args) {
		int a[]= {33,3,4,5};
		new TestArray2().min(a);

	}

}
