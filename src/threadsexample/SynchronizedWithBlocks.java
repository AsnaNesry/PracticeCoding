package threadsexample;

import java.util.Arrays;

class HashMapProcessorNew implements Runnable {
	private String[] strArr = null;

	public HashMapProcessorNew(String[] m) {
		this.strArr = m;
	}

	public String[] getMap() {
		return strArr;
	}

	public void run() {
		processArr(Thread.currentThread().getName());
	}

	private void processArr(String thrdName) {
		for (int incr = 0; incr < strArr.length; incr++) {
			processSomething(incr);
			addThreadName(incr, thrdName);
		}
	}

	private void addThreadName(int i, String thrdName) {
		synchronized (this) {
			strArr[i] = strArr[i] + ";" + thrdName;
		}
	}

	private void processSomething(int index) {
		try {
			Thread.sleep(index * 1000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

public class SynchronizedWithBlocks {

	public static void main(String[] args) {
		String[] arr = { "one", "two", "three", "four", "five", "six", "seven" };
		HashMapProcessorNew hmp = new HashMapProcessorNew(arr);

		Thread thread1 = new Thread(hmp, "Thrd1");
		Thread thread2 = new Thread(hmp, "Thrd2");
		Thread thread3 = new Thread(hmp, "Thrd3");

		long start = System.currentTimeMillis();
		thread1.start();
		thread2.start();
		thread3.start();

		try {
			thread1.join();
			thread2.join();
			thread3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("time taken=" + (System.currentTimeMillis() - start));
		System.out.println(Arrays.asList(hmp.getMap()));

	}

}
