package api.lang.String;

/* java.lang.String�� ���� �޼ҵ�
 * �ΰ��� ���ڿ��� ��ģ��
 * 
 */

public class ConcatDemo {
	public static void main(String[] args) {
		String str1 = "�ڹ�" ; 
		String str2 = "api �н� ��..." ; 
		String str3 = str1 + str2 ; 
		System.out.println("������ ����� : " +str3 );
		
		String str4 = "concat() ���� Hello!!" ;
		System.out.println("");
		System.out.println(str4.concat("�ڹٿ���!!"));
		
		
		
	}

}
