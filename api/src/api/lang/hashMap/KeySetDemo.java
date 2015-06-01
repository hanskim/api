package api.lang.hashMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
//import java.util.*  => 각급적이면 쓰지 마라.. why ? import 자체가 주소값이 추가되는 거임..

public class KeySetDemo {
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		 // Map에 값을 입력하는 경우  // 입력타임은 이렇게 밖에 안됨.
		map.put("김연아", new Integer(98));
		map.put("아사다 마오", new Integer(75));
		map.put("마징가", new Integer(65));
		
	/*디자인 패턴 중
	 * Iterator 패턴이라고 불리오는 Map에서 값을 추출하는 정규화된 패턴이다.
	 * Map에서  entrySet()  : key 와 value 축출
	 * Map에서 keySet() 키값만 축출
	 * 단. 어느 경우든지 Set 이용  : why ?  컬렉션에서 인터페이스 Set, List, Map 세가지가 대표적
	 * Set, Map  인덱스 값이 없어서 상호 호환이 잘됨
	 * Set은 중복 제거기능 Map에서 키값이 중복이 없어야 하는 속성
	 * Set을 통해 키값, 혹은 키 밸류값을 출력하는데 쓰임
	 * Map은 Itertor가 없어서 set에서
	 */
		
	// 맵의 값을 축출하는 경우 1. 값만. 2. 키만   3. 둘 다 	
		
	Set set = map.entrySet() ;    // entrySet() 둘 다 return하는 메소드 // new 를 안썼다. !!
	Iterator it = set.iterator(); 
	// 기능을 할당하는 것으로  봐야함.. ( 값의 할당이 아님) 
	// entrySet은 iterator() 기능이 없다  / 그래서 set (= 참조변수)를 통하고 그 참조변수 객체는  타입이 Set(<I>) 라 그 안에 있는 iterator를 호출하고 
	// 그 호출한 것들을 다시  Iterator <I> 타입의 객체가 참조한다.
	
	while (it.hasNext()) {
		Map.Entry e  = (Map.Entry) it.next();  // 맵의 요소타입의 entry ( inner class) 
		System.out.println( "참가자 : " + e.getKey()+", 점수 : "+ e.getValue());
	}

	
	
	set = map.keySet() ;    // 키만 return
	System.out.println("참가자 명단 : " + set);
	
	
	
	//collection에서 이클립스 체인 중에서 java.util.collection 선택
	
	Collection values = map.values();  // map의 밸류 값 뽑아오기.
    it = values.iterator();
    int total = 0 ; 
    
    while (it.hasNext()) {
		Integer i = (Integer) it.next() ; 
		total +=i.intValue() ; 
	}
    
    
    
    System.out.println("총점 : " +total);
    System.out.println("평균 : " +total/set.size());
    System.out.println("1등 : " + Collections.max(values));
    System.out.println("꼴등 : " +Collections.min(values));
	}

}
