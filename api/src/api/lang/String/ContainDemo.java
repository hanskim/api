package api.lang.String;

/* java.lang.String�� ���� �޼ҵ�
 * 
 * contain(s) : s��� ���ڰ� ���ԵǾ��� ���� üũ
 */

public class ContainDemo {
	public static void main(String[] args) {
		String str = "adbc��defd";
		
		System.out.println(str.contains("��")? "������ " : "�� ������");
	}
}
