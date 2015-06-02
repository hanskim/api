package api.lang.thread;

public class RunableDemo {

	public static void main(String[] args) {
		
		// Ŭ���� ������ �޼ҵ尡 run()�� ȣ��
		// start() �޼ҵ� ȣ�� ���  : callstack�� ������ ���� run()�� ȣ��
		// ������ ȣ�⽺�ÿ� run()�� �����Ŵ
		// �����带 �����ϴ� Ŭ������ start() �� ���� �����ؾ���.
		Runnable ra = new RunnableImpl( );
		Thread thr = new Thread(ra); // ra ( ���۷��� ����)�� ��.!!
		thr.start();  
	}
}

class RunnableImpl implements Runnable {

	@Override
	public void run() {    
		for (int i = 0; i < 5; i++) {
			/*
			 * ����� �ƴϱ� ������ super ��� �Ұ� �޼ҵ� ü���� ���� getNam() ȣ��
			 * Thread.currentThread() �� return ���� String �� �ƴ϶� Thread �ν��ͽ�
			 * ��ü�̴�... �� ��ü�� ������ �� �ִ�.!!
			 */
			System.out.println(Thread.currentThread().getName());
		}
	}
}
