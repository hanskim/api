package api.lang.String;

/* java.lang.String에 속한 메소드
 * == 객체의 레퍼런스 밸뷰 (hash code table) 을 비교한 것 
 * 문자열에 대한 비교는 반드시 equals() 메소드 이용
 * new 를 이용하여 heap 영역에 메모리를 할당하고 hashcode를 생성
 * 
 */

public class EqualsDemo {
	 public static void main(String[] args) {
		 
		 // string 값을 리터럴로 생성한 경우
		String str1 = "abc";
		String str2 = "abc";
		
		String result1 = (str1 == str2) ?  "1,2번 동일" : "1,2번 같지 않음";
		String result2 = (str1.equals(str2)) ?  "1,2번 동일" : "1,2번 같지 않음";
		
		System.out.println("str1 == str2인 경우 :  "+result1 );
		System.out.println("str1.equals(str2)인 경우 :  "+result2 );
		
		// string 값을 생성자로 생성한 경우
		
		String str3 = new String("ABC") ; 
		String str4 = new String("ABC") ; 
		String result3 = (str3 == str4) ?  "3,4번 동일" : "3,4번 같지 않음";
		String result4 = (str3.equals(str4)) ?  "3,4번 동일" : "3,4 같지 않음";
		System.out.println("str3 == str4인 경우 :  "+result3 );
		System.out.println("str3.equals(str4)인 경우 :  "+result4 );
		
		//result3만 다르다고 나오는 이유 
		// String 클래스의 생성자를 이용하여 String  인스턴스 생성한 경우
		// new 연산자에 의해  메모리 할당
		// 항상 새로운 String 인스턴스 생성 
		 // 즉. String 타입은 생성자로 객체를 생성하지 않고, 리터럴로 생성한다.
		// 모든 클래스파일에는 (*.class) 에는 constant pool 이라는 상수들이 있어서
		// 클래스 내에 사용되는 모든 리터럴과 상수들이 저장되어 있다
		// 등록하고자 하는 문자열이 상수풀에 이미 존재하는 경우 지가 알아서 그 주소값을 반환...
		
		System.out.println("=====================================");
		String str5 = new String("kkk") ; 
		String str6 = new String("kkk") ; 
		String resul5 = (str5 == str6) ?  "5,6번 동일" : "5,6번 같지 않음";
		String result6 = (str5.equals(str6)) ?  "5,6번 동일" : "5,6 같지 않음";
		System.out.println("str5 == str5인 경우 :  "+resul5 );
		System.out.println("str5.equals(str5)인 경우 :  "+result6 );
		
		
	}

}
