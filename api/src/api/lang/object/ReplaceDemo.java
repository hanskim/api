package api.lang.object;

/* replace 
 * 
 * 
 */

public class ReplaceDemo {
	public static void main(String[] args) {
		System.out.println( " Hello Tom".replace("Tom", "Alex"));
		System.out.println( "A B C D : A B C D".replaceAll(" C D", " E F"));
		
		/* �� ������ �ڹ� ���� 5(jdk1.5) ������ ����
		 * ���� ��� Ȯ��Ǿ� replaceAll ��� �߰�
		 * ������ ���ڵ� ����
		 * ���ԽĿ� ���� ����� �ִ��� �������� ���� ������  ??
		 * 
		 */
		
		System.out.println("[1] A B C D : A B C D ".replaceAll(" C D", " E F"));
		System.out.println("[2] A B C D : A B C D ".replaceAll(" C D", " E F"));
		
		System.out.println("================================================");
		
		System.out.println("[3]Hello Java !! ".replace("!", " "));
		System.out.println("[4]Hello Java !!!!! ".replaceAll(".!"	, " "));
		
		//.�� ������ ���ԽĿ��� �� ���� �� ���ڸ� ����
		// �� ����� replaceAll �� ����
		// ���� ���Խı��� ó�� ������ replaceAll�� �� ���� ��
		
		
		
	}

}
