package api.lang.String;

/* java.lang.String�� ���� �޼ҵ�
 * == ��ü�� ���۷��� ��� (hash code table) �� ���� �� 
 * ���ڿ��� ���� �񱳴� �ݵ�� equals() �޼ҵ� �̿�
 * new �� �̿��Ͽ� heap ������ �޸𸮸� �Ҵ��ϰ� hashcode�� ����
 * 
 */

public class EqualsDemo {
	 public static void main(String[] args) {
		 
		 // string ���� ���ͷ��� ������ ���
		String str1 = "abc";
		String str2 = "abc";
		
		String result1 = (str1 == str2) ?  "1,2�� ����" : "1,2�� ���� ����";
		String result2 = (str1.equals(str2)) ?  "1,2�� ����" : "1,2�� ���� ����";
		
		System.out.println("str1 == str2�� ��� :  "+result1 );
		System.out.println("str1.equals(str2)�� ��� :  "+result2 );
		
		// string ���� �����ڷ� ������ ���
		
		String str3 = new String("ABC") ; 
		String str4 = new String("ABC") ; 
		String result3 = (str3 == str4) ?  "3,4�� ����" : "3,4�� ���� ����";
		String result4 = (str3.equals(str4)) ?  "3,4�� ����" : "3,4 ���� ����";
		System.out.println("str3 == str4�� ��� :  "+result3 );
		System.out.println("str3.equals(str4)�� ��� :  "+result4 );
		
		//result3�� �ٸ��ٰ� ������ ���� 
		// String Ŭ������ �����ڸ� �̿��Ͽ� String  �ν��Ͻ� ������ ���
		// new �����ڿ� ����  �޸� �Ҵ�
		// �׻� ���ο� String �ν��Ͻ� ���� 
		 // ��. String Ÿ���� �����ڷ� ��ü�� �������� �ʰ�, ���ͷ��� �����Ѵ�.
		// ��� Ŭ�������Ͽ��� (*.class) ���� constant pool �̶�� ������� �־
		// Ŭ���� ���� ���Ǵ� ��� ���ͷ��� ������� ����Ǿ� �ִ�
		// ����ϰ��� �ϴ� ���ڿ��� ���Ǯ�� �̹� �����ϴ� ��� ���� �˾Ƽ� �� �ּҰ��� ��ȯ...
		
		System.out.println("=====================================");
		String str5 = new String("kkk") ; 
		String str6 = new String("kkk") ; 
		String resul5 = (str5 == str6) ?  "5,6�� ����" : "5,6�� ���� ����";
		String result6 = (str5.equals(str6)) ?  "5,6�� ����" : "5,6 ���� ����";
		System.out.println("str5 == str5�� ��� :  "+resul5 );
		System.out.println("str5.equals(str5)�� ��� :  "+result6 );
		
		
	}

}
