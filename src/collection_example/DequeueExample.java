package collection_example;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeueExample {

	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<String>();
		deque.add("java");
		deque.addFirst("jQuery");
		deque.addLast("HTML5");

		deque.offer("AngularJs");
		deque.offerFirst("NodeJs");
		deque.offerLast("javascript");

		System.out.println("elements of the Deque: " + deque);
		System.out.println("first element of the Deque before removal: " + deque.getFirst());

		deque.removeFirst();

		deque.pop();

		System.out.println("first element of Deque after removal: " + deque.peekFirst());

		System.out.println("last element of Deque after removal: " + deque.getLast());

		deque.removeLast();
		System.out.println("last element of Deque after removal: " + deque.peekLast());
		System.out.println("normal iteration....");
		Iterator<String> it1 = deque.iterator();

		while (it1.hasNext()) {
			System.out.println(" " + it1.next());

		}
		Iterator<String> it2 = deque.descendingIterator();
		System.out.println("Reversed Iteration....");

		while (it2.hasNext()) {
			System.out.println(" " + it2.next());

		}

	}

}
