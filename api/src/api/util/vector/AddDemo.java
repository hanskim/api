package api.util.vector;

import java.util.Vector;

/*java.util.Vector 의 메소드 
 * add() 는 벡터에 값을 할당하는 기능
 * 
 * 
 * 
 */

public class AddDemo {
	public static void main(String[] args) {
		String[] chatt = new String[3] ; 
		String  id = "admin";
		int age =27 ; 
		Boolean male = true ;
		
		Vector<String> vec = new Vector<String>() ;   // <String>을 지워도 오류 안남 why?  지우면 Object가 등장!!
		String tom = new String("admim");
		Boolean gender = new Boolean(false) ; 
		
		vec.add(new String("admin"));
		vec.add(String.valueOf(23));  // int는 vec에 바로 안들어감
		vec.add(String.valueOf(gender));// boolean vec에 바로 안들어감
		vec.add("리터럴 문자로 생성되 객체");
		//vec.add(2);  string타입이 아니면 오류
		
		// vector는 length를 사용하지 않고 size를 요소의 숫자를 표현하는데 사용
		//배열 loop 時  get(arr[i]) 처럼 쓰지만
		// 벡터는 element(i)
		
		for (int i = 0; i < vec.size(); i++) {
			System.out.println("벡터의 " + i +"번째 요소 : " + vec.elementAt(i));
			
			/*벡터의 0번째 요소 : admin
			벡터의 1번째 요소 : 23    => 숫자가 아니라 String 이다!!
			벡터의 2번째 요소 : false */
		}
	}
	

	

}
