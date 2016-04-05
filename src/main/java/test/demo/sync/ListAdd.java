package test.demo.sync;

import java.util.ArrayList;

public class ListAdd {

	/**
	 * // ѭ����Σ���������size�Ƕ���
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ListAdd listAdd = new ListAdd();
		final AddList addList = listAdd.new AddList();
		for (int i = 0; i < 5; i++) {
			// ���һ��
			addList.addItem();
			addList.getListSize();
		}
	}

	class AddList {
		private ArrayList<String> items = new ArrayList<String>();

		private volatile int length = 1;

		public void addItem() {
			new Thread(new Runnable() {

				@Override
				public void run() {
					synchronized (items) {
						while (length == 1) {
							try {
								items.wait();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						items.add("aaa");
						length = 1;

						items.notifyAll();
					}
				}
			}).start();
		}

		public void getListSize() {
			new Thread() {
				public void run() {
					// ��ȡsizeʱ��Ҳ��סitems����
					synchronized (items) {
						while (length == 0) {
							try {
								// System.out.println(Thread.currentThread().getName()
								// + " consumer wait");
								items.wait();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						length = 0;
						items.notifyAll();
						System.out.println(items.size());
					}
				}
			}.start();
		}

	}
}
