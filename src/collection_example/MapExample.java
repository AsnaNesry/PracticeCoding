package collection_example;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		Map<String, String> data = new HashMap<String, String>();
		data.put("A", "A");
		data.put("B", "B");// Add example
		data.put("C", "C");
		data.put("D", "null");

		System.out.println(data.put(null, "z"));
		System.out.println(data.put(null, "P"));
		System.out.println(data.put(null, "Q"));
		data.put("R", null);
		System.out.println("contents of map are: ");
		System.out.println(data);
		String value = data.get("c");// get example
		System.out.println("key=c, value=" + value);
		value = data.getOrDefault("P", " defaultValue");
		System.out.println("key=P,value=" + value);

		boolean keyExists = data.containsKey(null);
		boolean valueExists = data.containsValue("Q");

		System.out.println("key exists=" + keyExists + " " + "value exists=" + valueExists);

		Set<Entry<String, String>> entryset = data.entrySet();
		System.out.println(entryset);
		System.out.println("data map size= " + data.size());

		Map<String, String> data1 = new HashMap<>();
		data1.putAll(data);
		System.out.println("data1 mappings=" + data1);

		String nullKeyValue = data1.remove(null);
		System.out.println("data1 null key value=" + nullKeyValue);
		System.out.println("data1 after removing null key value= " + data1);

		Set<String> keyset = data.keySet();
		System.out.println("data map keys=" + keyset);

		Collection<String> values = data.values();
		System.out.println("data map keys=" + values);

		data.clear();
		System.out.println("data map is empty=" + data.isEmpty());

	}

}
