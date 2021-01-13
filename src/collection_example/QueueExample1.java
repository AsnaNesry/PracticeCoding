package collection_example;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample1 {

	public static void main(String[] args) {
		Queue<Integer> que = new LinkedList<>();
		for (int incr = 10; incr < 15; incr++)
			que.add(incr);
		System.out.println("elements of queue :" + que);

		int removedele = que.remove();
		System.out.println("removed element :" + removedele);

		System.out.println(que);

		int head = que.peek();
		System.out.println("head of queue :" + head);

		int size = que.size();
		System.out.println("size of queue :" + head);

		int head1 = que.poll();
		System.out.println("head of queue :" + head1);
		System.out.println("queue after poll: " + que);

	}

}
