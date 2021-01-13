package collection_example;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
	static List<String> ll;

	static void createList() {
		ll = new LinkedList<String>();
		ll.add("infosys");
		ll.add("UST");
		ll.add("TCS");
		ll.add("wipro");
		ll.add("HCL");
		ll.add("oracle");
		ll.add("google");
	}// end of createlist method

	static void traverseList() {
		System.out.println("moving from top to bottom");
		ListIterator<String> iter;
		iter = ll.listIterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		System.out.println("**********************************");
		System.out.println("moving from bottom to top");
		while (iter.hasPrevious()) {
			System.out.println(iter.previous());
		}
		System.out.println("**********************************");

	}// end of method traverse

	public static void main(String[] args) {
		createList();
		traverseList();

	}// end of main method

}// end of class
