package api.util.hashSet;

import java.util.* ;

/* add()�� ����ó�� ����� �߰� ��� ����
 * 
 */

public class AddDemo {
	public static void main(String[] args) {
		Object[] arr = {"1", new Integer(2), "2","3","3","4","5" } ;
		
		// java.util.set  �߰�
		Set set = new HashSet();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		System.out.println("������ ��� : " + set);
			
	}

}
