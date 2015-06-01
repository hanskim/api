package api.lang.hashMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
//import java.util.*  => �������̸� ���� ����.. why ? import ��ü�� �ּҰ��� �߰��Ǵ� ����..

public class KeySetDemo {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		 // Map�� ���� �Է��ϴ� ���  // �Է�Ÿ���� �̷��� �ۿ� �ȵ�.
		map.put("�迬��", new Integer(98));
		map.put("�ƻ�� ����", new Integer(75));
		map.put("��¡��", new Integer(65));
		
	/*������ ���� ��
	 * Iterator �����̶�� �Ҹ����� Map���� ���� �����ϴ� ����ȭ�� �����̴�.
	 * Map����  entrySet()  : key �� value ����
	 * Map���� keySet() Ű���� ����
	 * ��. ��� ������ Set �̿�  : why ?  �÷��ǿ��� �������̽� Set, List, Map �������� ��ǥ��
	 * Set, Map  �ε��� ���� ��� ��ȣ ȣȯ�� �ߵ�
	 * Set�� �ߺ� ���ű�� Map���� Ű���� �ߺ��� ����� �ϴ� �Ӽ�
	 * Set�� ���� Ű��, Ȥ�� Ű ������� ����ϴµ� ����
	 * Map�� Itertor�� ��� set����
	 */
		
	// ���� ���� �����ϴ� ��� 1. ����. 2. Ű��   3. �� �� 	
		
	Set set = map.entrySet() ;    // entrySet() �� �� return�ϴ� �޼ҵ� // new �� �Ƚ��. !!
	Iterator it = set.iterator(); 
	// ����� �Ҵ��ϴ� ������  ������.. ( ���� �Ҵ��� �ƴ�) 
	// entrySet�� iterator() ����� ����  / �׷��� set (= ��������)�� ���ϰ� �� �������� ��ü��  Ÿ���� Set(<I>) �� �� �ȿ� �ִ� iterator�� ȣ���ϰ� 
	// �� ȣ���� �͵��� �ٽ�  Iterator <I> Ÿ���� ��ü�� �����Ѵ�.
	
	while (it.hasNext()) {
		Map.Entry e  = (Map.Entry) it.next();  // ���� ���Ÿ���� entry ( inner class) 
		System.out.println( "������ : " + e.getKey()+", ���� : "+ e.getValue());
	}

	
	
	set = map.keySet() ;    // Ű�� return
	System.out.println("������ ��� : " + set);
	
	
	
	//collection���� ��Ŭ���� ü�� �߿��� java.util.collection ����
	
	Collection values = map.values();  // map�� ��� �� �̾ƿ���.
    it = values.iterator();
    int total = 0 ; 
    
    while (it.hasNext()) {
		Integer i = (Integer) it.next() ; 
		total +=i.intValue() ; 
	}
    
    
    
    System.out.println("���� : " +total);
    System.out.println("��� : " +total/set.size());
    System.out.println("1�� : " + Collections.max(values));
    System.out.println("�õ� : " +Collections.min(values));
	}

}
