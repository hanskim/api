package api.lang.String;
/*
 * java.lang.String�� �ִ�
 * toUpperCase() ���� �빮�ڷ� ��ȯ
 * toLowerCase() ���� �ҹ��ڷ� ��ȯ
 * valueOf()  �ٸ� Ÿ���� ��� ���ڿ� ��ȯ
 * 
 */

public class ValueOf {
	public static void main(String[] args) {
		String str = "Hello Java" ; 
		String msg ; 
		System.out.println( "�׽�Ʈ�� ���� : " + str);
		
		msg = str.toUpperCase();
		System.out.println(msg);
		msg = str.toLowerCase();
		System.out.println(msg);
		
		msg = String.valueOf(str.length());
		System.out.println( "valueof �� ��� : "  + msg);
		
	}
	
	

}
