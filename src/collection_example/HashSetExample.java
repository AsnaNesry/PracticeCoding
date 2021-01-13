package collection_example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> fruits = new HashSet<>();

		// add example
		fruits.add("Apple");
		fruits.add("Banana");

		// isEmpty example

		System.out.println("fruits set is empty= " + fruits.isEmpty());

		// contains example
		System.out.println("fruits contain Apple=" + fruits.contains("Apple"));
		System.out.println("fruits contain Apple=" + fruits.contains("Mango"));

		// remove example
		System.out.println("apple removed from fruits set= " + fruits.remove("Apple"));
		System.out.println("Mango removed from fruits set= " + fruits.remove("Mango"));

		// size example
		System.out.println("fruit set size=" + fruits.size());

		// addAll example
		List<String> list1 = new ArrayList<>();
		list1.add("Apple");
		list1.add("Apple");
		list1.add("Banana");
		list1.add("Mango");

		System.out.println("fruits set before addAll = " + fruits);
		System.out.println("list= " + list1);
		fruits.addAll(list1);
		System.out.println("fruits set after addAll = " + fruits);

		// iterator example
		Iterator<String> iter;
		iter = fruits.iterator();
		while (iter.hasNext()) {
			System.out.println("consuming fruits " + iter.next());
		}

		// remove all example
		fruits.add("Orange");
		System.out.println("fruits set before removeAll=" + fruits);
		System.out.println("list=" + list1);
		fruits.removeAll(list1);
		System.out.println("fruitset after remove all=" + fruits);

		// clear example
		fruits.clear();
		System.out.println("fruit set is empty=" + fruits.isEmpty());

	}

}
