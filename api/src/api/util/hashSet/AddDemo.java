package api.util.hashSet;

import java.util.* ;

/* add()는 벡터처럼 요소의 추가 기능 구현
 * 
 */

public class AddDemo {
	public static void main(String[] args) {
		Object[] arr = {"1", new Integer(2), "2","3","3","4","5" } ;
		
		// java.util.set  추가
		Set set = new HashSet();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		System.out.println("저장요소 출력 : " + set);
			
	}

}
