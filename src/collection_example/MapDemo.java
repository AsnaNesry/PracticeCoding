package collection_example;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Infosys");
		map1.put(2, "TCS");
		map1.put(3, "CTS");
		map1.put(4, "Wipro");
		map1.put(1, "Quest");
		map1.put(5, "Quest");
		map1.put(null, "Google");
		System.out.println();
		System.out.println("Map elements are");
		System.out.println("\t" + map1);

	}// end of main method

}// end of class
