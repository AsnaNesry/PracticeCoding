package collection_example;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueOfferOperations {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedBlockingQueue<>(3);
		System.out.println(queue.offer("one"));
		System.out.println(queue.offer("two"));
		System.out.println(queue);
		System.out.println(queue.offer("three"));
		System.out.println(queue);
		System.out.println(queue.offer("four"));
		System.out.println(queue);

		Queue<String> queue1 = new LinkedBlockingQueue<>(3);
		System.out.println(queue.add("one"));
		System.out.println(queue.add("two"));
		System.out.println(queue);
		System.out.println(queue.add("three"));
		System.out.println(queue);
		System.out.println(queue.add("four"));
		System.out.println(queue);

	}

}
