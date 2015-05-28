package api.lang.system;

/*
 * jdk 1.5 �������� ���Ե� autoboxing  ���
 * ��ȯ���� �⺻���� ���  wrapper class�̸�
 * ���� ������ ����.
 * 
 * parsInt() �� valueOf()  �� ���� ����
 * 
 * 
 */

public class ParseInt {
	public static void main(String[] args) {
		//������ ���� �⺻������ ĳ���� �� ��ȯ���
		
		int num1  = Integer.parseInt("200");
		int num2  = Integer.parseInt("200");
		int result = num1 + num2 ;
		System.out.println(result);
		
		// �⺻���� ���������� ����ȯ�ϴ�  �ϴ� ���( ĳ���� ���� ���� ) 
		//Integer num3 = (Integer)result ; 
		
		Integer num3 = result ;
		System.out.println("�⺻���� ���������� ��ȯ : " + num3);
		
		int num4 = 2 + num3  ;
		System.out.println("������  + �⺻�� ������ : " + num4);
		
		//int num5  = Integer.parseInt("Mazingga");   
		//System.out.println(num5);
		 // => ����� ����   java.lang.NumberFormatException
		// => ���ڸ� �Էµ� �� �ֵ��� ����ڵ�!!   exception ó�� �ؾ���.!
		
		
	}

}
