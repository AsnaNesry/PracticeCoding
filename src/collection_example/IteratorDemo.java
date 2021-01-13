package collection_example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	static void iteratorDemo() {
		List<String> a1 = new ArrayList<>();
		a1.add("infosys");
		a1.add("UST Global");
		a1.add("Quest Global");
		a1.add("TCS");
		a1.add("CTS");
		a1.add("Wipro");

		Iterator<String> iter;// reference created for iterator
		iter = a1.iterator();

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

	public static void main(String[] args) {
		iteratorDemo();
	}//end of method

}//end of class
