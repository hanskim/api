package api.util.arraylist;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


/*java.util.Arraylist dml apthem
 * add() : Vector�� ����
 */

public class AddDemo {
	public static void main(String[] args) {
		/*
		 * Vector()�� ���������� String ���
		 * �ӵ��� ������ ����ȭ ���� ( = �׷��� ������)
		 * 
		 * ArrayList �� ����������  StringBuffer�� ���
		   ����ȭ ���� �� ��
		  */
		
	    ArrayList<String> lists = new ArrayList<String>();
	    lists.add("����");
	    lists.add("�λ�");
	    lists.add("����");
	    
	    // ����� Iterator() ���   , while���� ���� ����Ű ����� ��
	    
	    Iterator<String>  it1 =  lists.iterator();
	    while (it1.hasNext()) {
			System.out.printf("%s",it1.next());
			
		}
	    System.out.println("");
	    
	    ListIterator<String>  it2 =  lists.listIterator();
	    
	    while (it2.hasNext()) {
			System.out.printf("%s", it2.next());  
			// �ٿ� ĳ���� �ʿ� ���� , String�� �� ����
		}
	    System.out.println("");

	    // previous()�̿�
	    
	
	    while (it2.hasPrevious()){
	    	System.out.printf("%s", it2.previous());  
		
		}
	    List <String> list2 = new ArrayList<String>() ; 
	    
	    //�������̽� <���׸�> ��������  = new ������ ��ü<���׸�>()
	    list2.addAll(lists);
	    
	    for (String s : list2) {
	    	   System.out.printf("%s", s);

	    	  }
	    	  System.out.println();
	    	  // �˻� ����� ���� ������ �߰�
	    	  list2.add("����");
	    	  list2.add("��õ");
	    	  list2.add("����");
	    	  /*
	    	   * ��� 5 �˻��ؼ� ���
	    	   */
	    	  Iterator<String> it3 = list2.iterator();
	    	  String str = null;
	    	  while (it3.hasNext()) {
	    	   str = it3.next();
	    	   if (str.startsWith("��")) {
	    	    System.out.printf("%s", str);
	    	   }
	    	  }
	    	  System.out.println();

	    	  list2.add("��õ");
	    	  list2.add("��õ");
	    	  list2.add("��õ");

	    	  Iterator<String> it4 = list2.iterator();
	    	  while (it4.hasNext()) {
	    	   System.out.printf("%s", it4.next());
	    	   ;

	    	  }
	    	 }

 
		
	}

