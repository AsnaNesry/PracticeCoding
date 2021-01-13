package collection_example;

import java.util.LinkedList;
import java.util.Queue;

public class QueueRemoveOperations {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.offer("one");
		queue.offer("two");
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());

		queue.offer("one");
		queue.offer("two");
		System.out.println(queue);
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		System.out.println(queue.remove());

	}

}
