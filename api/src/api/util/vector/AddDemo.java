package api.util.vector;

import java.util.Vector;

/*java.util.Vector �� �޼ҵ� 
 * add() �� ���Ϳ� ���� �Ҵ��ϴ� ���
 * 
 * 
 * 
 */

public class AddDemo {
	public static void main(String[] args) {
		String[] chatt = new String[3] ; 
		String  id = "admin";
		int age =27 ; 
		Boolean male = true ;
		
		Vector<String> vec = new Vector<String>() ;   // <String>�� ������ ���� �ȳ� why?  ����� Object�� ����!!
		String tom = new String("admim");
		Boolean gender = new Boolean(false) ; 
		
		vec.add(new String("admin"));
		vec.add(String.valueOf(23));  // int�� vec�� �ٷ� �ȵ�
		vec.add(String.valueOf(gender));// boolean vec�� �ٷ� �ȵ�
		vec.add("���ͷ� ���ڷ� ������ ��ü");
		//vec.add(2);  stringŸ���� �ƴϸ� ����
		
		// vector�� length�� ������� �ʰ� size�� ����� ���ڸ� ǥ���ϴµ� ���
		//�迭 loop ��  get(arr[i]) ó�� ������
		// ���ʹ� element(i)
		
		for (int i = 0; i < vec.size(); i++) {
			System.out.println("������ " + i +"��° ��� : " + vec.elementAt(i));
			
			/*������ 0��° ��� : admin
			������ 1��° ��� : 23    => ���ڰ� �ƴ϶� String �̴�!!
			������ 2��° ��� : false */
		}
	}
	

	

}
