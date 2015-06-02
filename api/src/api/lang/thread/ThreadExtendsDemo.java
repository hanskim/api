package api.lang.thread;

public class ThreadExtendsDemo {
	public static void main(String[] args) {
		ThreadExtends thr = new ThreadExtends();

		/*
		 * 스레드를 잘 모르는 상황에서 아래 호출 메소드를 run()이라고 하기 쉽다. 주의!! 반드시 호출은 start() 를 통해서
		 * 해야함 내부적으로 run() 이 포함한 여러가지 메소드를 호출하게 됨
		 */
		thr.start();
		
		/*결과
		Thread-0
		Thread-0
		Thread-0
		Thread-0
		Thread-0*/
	}
}

class ThreadExtends extends Thread {
	// 스레드 상속 받을 시 자동 생성 법
	// Ctrl + Space + Enter

	public ThreadExtends() {
		for (int i = 0; i < 5; i++) {
			// getName() 은 이 클래스의 부모인 Thread 가 가지고 있는 메소드
			// 부모의 메소드를 오버라이딩 없이 바로 사용 ㄴ=super. 으로 호출
			System.out.println(super.getName());

		}
	}
}
