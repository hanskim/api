package api.util.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * ���׸�
 * �ݷ����� �����ϴ� ���
 * ��� ������ ������ Ÿ���� �ٸ� �� �ֵ��� �Ϲ�ȭ�� Ÿ��
 * �Ű������� Ŭ������ �޼ҵ带 �ۼ��ϴ� ���
 * �÷��� Ŭ�������� Ÿ�� �Ķ���ͷ� ���Ǵ� ���ڴ� �ٸ� ������ ȥ���� ���ϱ� ���� �Ϲ������� ������ ���� ǥ����
 *  E :  Element Set <E> set
 *  T :  Type    Set <T> set
 *  V :  value
 *  K :  Map<K,V>
 * 
 */

public class GenericSyntax {
	
	public <E> Object test(Set<E> map){
		return null ; 
	}
	
	public <K,V> void test2() {       // ���׸� Ÿ���� �̷� ������� ���� �ִ�. => ���� �߿����� ����
	   Map<K,V> map = new HashMap<K,V>() ;
		
	}
	

}
