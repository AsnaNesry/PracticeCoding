package collection_example;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		Set<String> example = new TreeSet<String>();

		example.add("C");
		example.add("A");
		example.add("D");
		example.add("B");
		example.add("E");
		example.add("G");
		example.add("F");
		example.add("I");
		example.add("J");
		example.remove("I");
		Iterator<String> iter;
		iter = example.iterator();
		System.out.println("Tree set string arguments are:");
		while (iter.hasNext()) {
			System.out.println(iter.next() + " ");
		}
		System.out.println("tree set size: " + example.size());
	}// end of main method

}// end of class
