package collection_example;

import java.util.HashSet;
import java.util.Set;

public class SetCommonOperations {

	public static void main(String[] args) {
		Set<String> vowels = new HashSet<>();
		// add example
		vowels.add("A");
		vowels.add("E");
		vowels.add("I");

		// cannot insert elements based on index to a set
		System.out.println(vowels);

		Set<String> s = new HashSet<>();
		s.add("O");
		s.add("U");

		// appending set elements to vowels

		vowels.addAll(s);

		System.out.println(vowels);
		// clear example to empty the set
		s.clear();
		// size example
		System.out.println("letters set size= " + vowels.size());

		vowels.clear();
		vowels.add("E");
		vowels.add("E");
		vowels.add("I");
		vowels.add("O");

		System.out.println("Given set element contain E element or not?=" + vowels.contains("E"));

	}

}
