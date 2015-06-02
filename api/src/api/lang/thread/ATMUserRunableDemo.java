package api.lang.thread;

public class ATMUserRunableDemo {
	public static void main(String[] args) {
		
		ATM atm = new ATM() ; 
		Runnable hong = new ATMUser(atm,"홍길동");
		Runnable kim = new ATMUser(atm,"김덕순");
		Runnable moon = new ATMUser(atm,"문길동");
		
		Thread thr1 = new Thread(hong);
		thr1.start();
		Thread thr2 = new Thread(kim);
		thr2.start();
		Thread thr3 = new Thread(moon);
		thr3.start();
	}
}

class ATM{
	public synchronized void DrawMoney(String name) {  
		
		//synchronized 의 역할 ? :  한 스레드가 끝나야만 다른 쓰레드가 실행될 수 있도록 함
		// 아웃라인에 시계표시!!
		// 이걸로 인한 결과  
		/*홍길동님이 인출 요청함
		홍길동님이 인출 중
		홍길동님이 인출 완료함
		문길동님이 인출 요청함
		문길동님이 인출 중
		문길동님이 인출 완료함
		김덕순님이 인출 요청함
		김덕순님이 인출 중
		김덕순님이 인출 완료함*/
		// 이걸 지우면  :  각각의 스레드가 랜덤으로 막 실행됨...

		System.out.println(name +"님이 인출 요청함");
		
		for (int i = 0; i < 100000000; i++) {
			if(i == 10000)
			System.out.println(name +"님이 인출 중");
		}
		System.out.println(name +"님이 인출 완료함");
	}
}

class ATMUser implements Runnable{
	ATM atm;
	String  name ; 
	
	public ATMUser() {
		this(null,"") ; 
	}
	
	public ATMUser (ATM atm, String name) {
		super() ; 
		this.atm =atm ;
		this.name =name ;
	}
	
	public void run() {
		atm.DrawMoney(name);
	}
	
	
}
