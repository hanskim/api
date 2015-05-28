package api.lang.String;
/*
 * java.lang.String에 있는
 * trim()메소드는 문자열을 앞뒤 공백을 제거
 * 문자열 내부 공백은 제거하지 않는다
 * 
 */

public class TrimDemo {
	public static void main(String[] args) {
		String str1 = "     Hello World  !!    ";
		System.out.println("trim사용시: " + str1.trim());
		System.out.println("trim사용 후 안쪽 공백 제거:  " + str1.trim().replaceAll(" ", ""));
		
		  //=> 필요한 띄어쓰기까지 다 제거됨 ;;
		
		
		String str2 = "     Hello Java World  !!    ";
		System.out.println("메서드체인으로 사용시 :    " + str2.trim().replaceAll("Java",  "JSP"));
		
		System.out.println( "trim()을 사용하지 않는 경우 : " + " Hello Java".indexOf("J"));
		System.out.println( "trim()을 사용한  경우 : " + " Hello Java".trim().indexOf("J"));
		
		
	}

}
