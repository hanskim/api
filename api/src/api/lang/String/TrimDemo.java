package api.lang.String;
/*
 * java.lang.String�� �ִ�
 * trim()�޼ҵ�� ���ڿ��� �յ� ������ ����
 * ���ڿ� ���� ������ �������� �ʴ´�
 * 
 */

public class TrimDemo {
	public static void main(String[] args) {
		String str1 = "     Hello World  !!    ";
		System.out.println("trim����: " + str1.trim());
		System.out.println("trim��� �� ���� ���� ����:  " + str1.trim().replaceAll(" ", ""));
		
		  //=> �ʿ��� ������� �� ���ŵ� ;;
		
		
		String str2 = "     Hello Java World  !!    ";
		System.out.println("�޼���ü������ ���� :    " + str2.trim().replaceAll("Java",  "JSP"));
		
		System.out.println( "trim()�� ������� �ʴ� ��� : " + " Hello Java".indexOf("J"));
		System.out.println( "trim()�� �����  ��� : " + " Hello Java".trim().indexOf("J"));
		
		
	}

}
