package api.lang.hashMap;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("���̵� �Է¶�  : ");
		String id = scan.next() ; 
		System.out.println("��� �Է¶� : ");
		String password = scan.next() ; 
		System.out.println("�̸� �Է¶� : ");
		String name = scan.next() ; 
		System.out.println("���� �Է¶� : ");
		int age = scan.nextInt() ; 
		System.out.println("�ּ� �Է¶� : ");
		String addr = scan.next() ; 
		System.out.println("");
		
		/*
		 * ��ü�� �����Ͽ� �Ϸ�
		 * 
		 */
		
		// ���̰� �Է� �� ���� ��ü ���� why ?  ��ü�� �ҷ����� �޼ҵ带 Ȱ���ϱ� ����
		MemberSerive serive = new MemberServiceImpl( );
		serive.join("go", "pass", "gozial", 20, "�����");
		
		
		System.out.println("ȸ�� ������ �Ǿ����ϴ�. ");
		System.out.println("�α��� ���ּ���. ");
		
		System.out.println("id�� �Է����ּ���. ");
		id =scan.next();
		System.out.println("����� �Է����ּ���. ");  
		password =scan.next();            // ��� �Է� ��  impl���� 
		
		serive.login(id, password);
		

	}

}
