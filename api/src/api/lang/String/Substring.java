package api.lang.String;
/*
 * java.lang.String �� �ִ�
 * substring() �޼ҵ�
 * ������ġ ~ ����ġ ���ڿ� ����
 * begin < = x  <end
 */

public class Substring {
	public static void main(String[] args) {
		System.out.println("�Ķ���Ͱ� �� ���϶� : " + "Hello Java".substring(5));
		// 0���� �����Ͽ� 5����
		System.out.println("�Ķ���Ͱ� �� ���϶� : " + "Hello Java".substring(6,8));
		// 0���� �����ؼ� 6���� 8 �̸�����
	}

}
