package api.lang.system;

/*
 * jdk 1.5 버젼부터 도입된 autoboxing  기능
 * 반환값이 기본형일 경우  wrapper class이면
 * 서로 차리가 없다.
 * 
 * parsInt() 와 valueOf()  가 차이 없음
 * 
 * 
 */

public class ParseInt {
	public static void main(String[] args) {
		//리턴할 값을 기본형으로 캐스팅 時 반환방법
		
		int num1  = Integer.parseInt("200");
		int num2  = Integer.parseInt("200");
		int result = num1 + num2 ;
		System.out.println(result);
		
		// 기본형을 참조형으로 형변환하는  하는 경우( 캐스팅 생략 가능 ) 
		//Integer num3 = (Integer)result ; 
		
		Integer num3 = result ;
		System.out.println("기본형을 참조형으로 변환 : " + num3);
		
		int num4 = 2 + num3  ;
		System.out.println("참조형  + 기본형 연산결과 : " + num4);
		
		//int num5  = Integer.parseInt("Mazingga");   
		//System.out.println(num5);
		 // => 디버깅 오류   java.lang.NumberFormatException
		// => 숫자만 입력될 수 있도록 방어코딩!!   exception 처리 해야함.!
		
		
	}

}
