package collection_example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEntrySetExample {

	public static void main(String[] args) {
		Map<String, String> companies = new HashMap<String, String>();
		companies.put("Infosys", "Mysore");
		companies.put("UST", "Trivandrum");
		companies.put("Quest", "Technopark");
		companies.put("Tcs", "Banglore");
		companies.put("SAP", "ITPL");
		companies.put("Oracle", "US");

		// getting map.entry elements using entrySet()

		Set<Map.Entry<String, String>> company = companies.entrySet();

		// looking the set of map.entry values
		for (Map.Entry<String, String> entry : company) {
			System.out.println("key is " + entry.getKey() + " value is " + entry.getValue());
		}

		System.out.println("\n displaying data using iterator");
		Set<Map.Entry<String, String>> companySet = companies.entrySet();
		Iterator<Map.Entry<String, String>> iter = companySet.iterator();

		while (iter.hasNext()) {
			Map.Entry<String, String> entry = iter.next();
			System.out.println("key is " + entry.getKey() + " value is " + entry.getValue());
		}

	}

}
