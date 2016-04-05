package test.demo.threadlocal;

public class ThreadLocalTest {
	
	private final int TOTAL = 10;

	private volatile ThreadLocal<Integer> t = new ThreadLocal<Integer>();
	
	
	public ThreadLocalTest() {
		t.set(0);
	}
	
	public void foo() {
		new Thread() {
			@Override
			public void run() {
				while (true) {
					Integer current = t.get();
					if (current == null) {
						t.set(0);
						current = t.get();
					}
					if (current > TOTAL) {
						t = new ThreadLocal<Integer>();
					} else {
						t.set(++current);
					}
					System.out.println(Thread.currentThread().getName() + ":" + current);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();
	}
	
	public static void main(String[] args) {
		ThreadLocalTest test = new ThreadLocalTest();
		for (int i = 0; i < 3; i++) {
			test.foo();
		}
	}
}
