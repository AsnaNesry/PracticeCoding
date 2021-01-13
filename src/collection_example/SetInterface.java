package collection_example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetInterface {
	static void iteratorDemo() {
		Set<Integer> a1 = new HashSet<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(10);

		System.out.println("Array Elements: ");
		// System.out.println("\t" + a1);
		Iterator<Integer> iter;
		iter = a1.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println(a1.size());
		System.out.println(a1.isEmpty());
	}

	public static void main(String[] args) {
		iteratorDemo();

	}

}
