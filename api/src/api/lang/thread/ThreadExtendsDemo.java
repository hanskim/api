package api.lang.thread;

public class ThreadExtendsDemo {
	public static void main(String[] args) {
		ThreadExtends thr = new ThreadExtends();

		/*
		 * �����带 �� �𸣴� ��Ȳ���� �Ʒ� ȣ�� �޼ҵ带 run()�̶�� �ϱ� ����. ����!! �ݵ�� ȣ���� start() �� ���ؼ�
		 * �ؾ��� ���������� run() �� ������ �������� �޼ҵ带 ȣ���ϰ� ��
		 */
		thr.start();
		
		/*���
		Thread-0
		Thread-0
		Thread-0
		Thread-0
		Thread-0*/
	}
}

class ThreadExtends extends Thread {
	// ������ ��� ���� �� �ڵ� ���� ��
	// Ctrl + Space + Enter

	public ThreadExtends() {
		for (int i = 0; i < 5; i++) {
			// getName() �� �� Ŭ������ �θ��� Thread �� ������ �ִ� �޼ҵ�
			// �θ��� �޼ҵ带 �������̵� ���� �ٷ� ��� ��=super. ���� ȣ��
			System.out.println(super.getName());

		}
	}
}
