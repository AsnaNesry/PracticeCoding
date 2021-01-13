package collection_example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String> a1 = new ArrayList<String>();
		a1.add("Raj");
		a1.add("pridwi");
		a1.clear();
		a1.add("prabhu");
		a1.add("avni");
		a1.add("Raj");

		System.out.println("Array Elements: ");
		System.out.println("\t" + a1);
		System.out.println(a1.size());

		List<String> l1 = new LinkedList<String>();
		l1.add("Raj");
		l1.add("pridwi");
		l1.add("prabhu");
		System.out.println("linked list Elements: ");
		System.out.println("\t" + l1);
		System.out.println(l1.size());

	}// end of main method

}// end of class