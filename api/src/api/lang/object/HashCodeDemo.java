package api.lang.object;

/* hashing ����� ���Ǵ� hash�޼ҵ�
 * �ؽ��� �ٷ��� �����͸� �����ϰ� �˻��ϴµ� ���Ǵ� ������ �������
 * ex . Ʈ���� �ؽ��±�   : ������ �ؽ��±�(�ּ�)�� ÷�ε� �Խñ��� ������ �ּҰ� �����Ͽ� ���� �˻���� ����
 * 
 * 
 */

public class HashCodeDemo {
	public static void main(String[] args) {
		String abc = new String("abc");
		String abc2 = "abc";

		System.out.println("abc�� �ؽ��±� : " + abc.hashCode());
		System.out.println("abc2�� �ؽ��±� : " + abc2.hashCode());

		/*
		 * ��� abc�� �ؽ��±� : 96354 abc2�� �ؽ��±� : 96354 String Ÿ���� new String
		 * ("abc")ó�� �����ڸ� ���� ����������, ""ó�� ���ͷ� ������ �����̳� ������ �ּҰ��� �����ٴ� ���� �˼� �ִ�. ���
		 * ��ü�� String ���� �̷��� Ư���� ���Ѵ�.
		 */

	}

}
