package api.lang.String;

/* java.lang.String�� ���� �޼ҵ�
 * charAt() ; ������ ��ġ�� �ִ� ���ڿ� ����  , 0���� ����
 * indexOf()  ;  �־��� ���ڰ� �����ϴ��� Ȯ�� �� ��ġ�� �˷���  / ������ -1 
 */

public class CharAtDemo {
	public static void main(String[] args) {
		String ssn = "801234-1234567" ; 
		//char isMan = ssn.charAt(7);
		/*
		 * �ε����� 0���� �����ϴϱ� ���� ������ 7��° �ڸ�
		 */
		char isMan =ssn.charAt(ssn.indexOf("-")+1);
		//indexOf �� �Ķ���ͷ� �־��� String ���� ��ġ�� ���� 
		// charAt���� indexOf���� ����.
		
		switch (isMan) {
		case 1: case 3:  System.out.println("����"); break;
		case 2: case 4:  System.out.println("����"); break;
		default: System.out.println("�Է¿���"); break;
		
		}
	}

}
