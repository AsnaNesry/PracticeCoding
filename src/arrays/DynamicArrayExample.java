package arrays;

public class DynamicArrayExample {
	
	
int arr[]=new int[20];
void createArray() {
	int empNo = 101;
	for(int incr=0;incr<arr.length;incr++) {
		arr[incr]=empNo;
		empNo+=1;
	}//end of forloop
}
	
	void display() {
		for(int incr=0;incr<arr.length;incr++) {
			System.out.println(arr[incr]);
		}
		
	}


	public static void main(String[] args) {
		DynamicArrayExample dae = new DynamicArrayExample();
		dae.createArray();
		dae.display();

	}

}
