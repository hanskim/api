package api.lang.String;
/*
 * java.lang.String에 있는
 * toUpperCase() 전부 대문자로 변환
 * toLowerCase() 전부 소문자로 변환
 * valueOf()  다른 타입을 모두 문자열 변환
 * 
 */

public class ValueOf {
	public static void main(String[] args) {
		String str = "Hello Java" ; 
		String msg ; 
		System.out.println( "테스트된 문장 : " + str);
		
		msg = str.toUpperCase();
		System.out.println(msg);
		msg = str.toLowerCase();
		System.out.println(msg);
		
		msg = String.valueOf(str.length());
		System.out.println( "valueof 의 결과 : "  + msg);
		
	}
	
	

}
