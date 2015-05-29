package api.util.arraylist;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


/*java.util.Arraylist dml apthem
 * add() : Vector와 동일
 */

public class AddDemo {
	public static void main(String[] args) {
		/*
		 * Vector()는 내부적으로 String 사용
		 * 속도는 느리고 동기화 지원 ( = 그래서 느리다)
		 * 
		 * ArrayList 는 내부적으로  StringBuffer를 사용
		   동기화 지원 안 함
		  */
		
	    ArrayList<String> lists = new ArrayList<String>();
	    lists.add("서울");
	    lists.add("부산");
	    lists.add("광주");
	    
	    // 출력은 Iterator() 사용   , while문과 같이 단축키 사용할 것
	    
	    Iterator<String>  it1 =  lists.iterator();
	    while (it1.hasNext()) {
			System.out.printf("%s",it1.next());
			
		}
	    System.out.println("");
	    
	    ListIterator<String>  it2 =  lists.listIterator();
	    
	    while (it2.hasNext()) {
			System.out.printf("%s", it2.next());  
			// 다운 캐스팅 필요 없음 , String이 될 예정
		}
	    System.out.println("");

	    // previous()이용
	    
	
	    while (it2.hasPrevious()){
	    	System.out.printf("%s", it2.previous());  
		
		}
	    List <String> list2 = new ArrayList<String>() ; 
	    
	    //인터페이스 <제네릭> 참조변수  = new 구현한 객체<제네릭>()
	    list2.addAll(lists);
	    
	    for (String s : list2) {
	    	   System.out.printf("%s", s);

	    	  }
	    	  System.out.println();
	    	  // 검색 명령을 위한 데이터 추가
	    	  list2.add("광주");
	    	  list2.add("인천");
	    	  list2.add("대전");
	    	  /*
	    	   * 출력 5 검색해서 출력
	    	   */
	    	  Iterator<String> it3 = list2.iterator();
	    	  String str = null;
	    	  while (it3.hasNext()) {
	    	   str = it3.next();
	    	   if (str.startsWith("대")) {
	    	    System.out.printf("%s", str);
	    	   }
	    	  }
	    	  System.out.println();

	    	  list2.add("인천");
	    	  list2.add("인천");
	    	  list2.add("인천");

	    	  Iterator<String> it4 = list2.iterator();
	    	  while (it4.hasNext()) {
	    	   System.out.printf("%s", it4.next());
	    	   ;

	    	  }
	    	 }

 
		
	}

