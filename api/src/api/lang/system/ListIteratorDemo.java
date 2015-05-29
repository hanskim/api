package api.lang.system;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
List<String> list = new ArrayList<String>();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		ListIterator<String> it1 = list.listIterator(list.size());
		 
		ListIterator<String> it2 = list.listIterator();
		System.out.println("��������� ");
		
		// () == Ŀ���� ��ġ�� ���� �����ϸ� �ȴ�
		// ���� ���������� �ѹ� Iterator�� ������ Ŀ���� ���� ���������� ����Ǿ�
		// int index�� ���� �ʾƵ� ������ ��� ����!!
		
		// ���� ����� hasPrevious ()�� �ٲ���
		while (it1.hasPrevious()) {
			System.out.print(it1.previous()+ "\t");
			
		}
		
		
		

	}

}
