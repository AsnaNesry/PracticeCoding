package collection_example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String, Integer> vehicles = new HashMap<String, Integer>();

		vehicles.put("BMW", 5);
		vehicles.put("Mercedes", 3);
		vehicles.put("Audi", 4);
		vehicles.put("Ford", 10);

		System.out.println("total vehicles" + vehicles.size());
		for (String key : vehicles.keySet()) {
			System.out.println(key + "-" + vehicles.get(key));
			System.out.println();
		}

		System.out.println("using iterator");
		Set<String> ref = vehicles.keySet();
		Iterator<String> iter = ref.iterator();
		String s1;
		while (iter.hasNext()) {
			s1 = iter.next();
			System.out.println(vehicles.get(s1));
		}

		String searchKey = "Audi";
		if (vehicles.containsKey(searchKey)) {
			System.out.println("found total" + vehicles.get(searchKey) + " " + searchKey + "cars!\n");
		}
		// clear all values
		vehicles.clear();

		// equals to zero
		System.out.println("after clear operation,size:" + vehicles.size());
	}// end of main method
}// end of class
