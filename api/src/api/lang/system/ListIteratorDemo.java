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
		System.out.println("역방향출력 ");
		
		// () == 커서의 위치로 봐서 이해하면 된다
		// 따라서 순방향으로 한번 Iterator를 돌리면 커서가 제일 마지막으로 변경되어
		// int index를 주지 않아도 역방향 출력 가능!!
		
		// 역순 출력은 hasPrevious ()로 바꿔줌
		while (it1.hasPrevious()) {
			System.out.print(it1.previous()+ "\t");
			
		}
		
		
		

	}

}
