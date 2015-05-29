package api.util.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class IteratorDemo {
	public static void main(String[] args) {
		
		//ArrayList list = new ArrayList() ;
		// 도 문법에 틀리지 않지만 콜렉션 타입들은 보통 인터페이스로 선언한다
		// List import 할 때 주의점  :  java.awt.List 선택하지 않도록!
		// java.util.List 패키지 선택
		
		List<String> list = new ArrayList<String>();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator<String> it = list.iterator();
		
		while (it.hasNext()) {
			System.out.println( it.next() +"\t");
			
		}
		
	}

}
