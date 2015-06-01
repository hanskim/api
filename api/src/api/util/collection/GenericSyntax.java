package api.util.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 제네릭
 * 콜렉션을 구현하는 기법
 * 모든 종류의 데이터 타입을 다를 수 있도록 일반화한 타입
 * 매개변수로 클래스나 메소드를 작성하는 기법
 * 컬렉션 클래스에서 타입 파라미터로 사용되는 문자는 다른 변수와 혼동을 피하기 위해 일반적으로 다음과 같이 표현함
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
	
	public <K,V> void test2() {       // 제네릭 타입을 이런 방식으로 쓸수 있다. => 별로 중요하지 않음
	   Map<K,V> map = new HashMap<K,V>() ;
		
	}
	

}
