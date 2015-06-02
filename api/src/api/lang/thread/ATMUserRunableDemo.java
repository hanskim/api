package api.lang.thread;

public class ATMUserRunableDemo {
	public static void main(String[] args) {
		
		ATM atm = new ATM() ; 
		Runnable hong = new ATMUser(atm,"ȫ�浿");
		Runnable kim = new ATMUser(atm,"�����");
		Runnable moon = new ATMUser(atm,"���浿");
		
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
		
		//synchronized �� ���� ? :  �� �����尡 �����߸� �ٸ� �����尡 ����� �� �ֵ��� ��
		// �ƿ����ο� �ð�ǥ��!!
		// �̰ɷ� ���� ���  
		/*ȫ�浿���� ���� ��û��
		ȫ�浿���� ���� ��
		ȫ�浿���� ���� �Ϸ���
		���浿���� ���� ��û��
		���浿���� ���� ��
		���浿���� ���� �Ϸ���
		��������� ���� ��û��
		��������� ���� ��
		��������� ���� �Ϸ���*/
		// �̰� �����  :  ������ �����尡 �������� �� �����...

		System.out.println(name +"���� ���� ��û��");
		
		for (int i = 0; i < 100000000; i++) {
			if(i == 10000)
			System.out.println(name +"���� ���� ��");
		}
		System.out.println(name +"���� ���� �Ϸ���");
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
