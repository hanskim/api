package api.lang.thread;

public class RunableDemo {

	public static void main(String[] args) {
		
		// 클래스 내부의 메소드가 run()을 호출
		// start() 메소드 호출 방법  : callstack을 생성한 다음 run()을 호출
		// 생성된 호출스택에 run()을 저장시킴
		// 스레드를 구현하는 클래스는 start() 를 통해 시작해야함.
		Runnable ra = new RunnableImpl( );
		Thread thr = new Thread(ra); // ra ( 레퍼런스 변수)가 들어감.!!
		thr.start();  
	}
}

class RunnableImpl implements Runnable {

	@Override
	public void run() {    
		for (int i = 0; i < 5; i++) {
			/*
			 * 상속이 아니기 때문에 super 사용 불가 메소드 체인을 통한 getNam() 호출
			 * Thread.currentThread() 과 return 값이 String 이 아니라 Thread 인스터스
			 * 객체이다... 즉 객체도 리턴할 수 있다.!!
			 */
			System.out.println(Thread.currentThread().getName());
		}
	}
}
