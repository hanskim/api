package api.lang.String;

/* java.lang.String에 속한 메소드
 * 두개의 문자열을 합친다
 * 
 */

public class ConcatDemo {
	public static void main(String[] args) {
		String str1 = "자바" ; 
		String str2 = "api 학습 중..." ; 
		String str3 = str1 + str2 ; 
		System.out.println("연산자 사용결과 : " +str3 );
		
		String str4 = "concat() 사용시 Hello!!" ;
		System.out.println("");
		System.out.println(str4.concat("자바월드!!"));
		
		
		
	}

}
