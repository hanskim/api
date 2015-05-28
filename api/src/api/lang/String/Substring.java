package api.lang.String;
/*
 * java.lang.String 에 있는
 * substring() 메소드
 * 시작위치 ~ 끝위치 문자열 리턴
 * begin < = x  <end
 */

public class Substring {
	public static void main(String[] args) {
		System.out.println("파라미터가 한 개일때 : " + "Hello Java".substring(5));
		// 0부터 시작하여 5부터
		System.out.println("파라미터가 두 개일때 : " + "Hello Java".substring(6,8));
		// 0부터 시작해서 6부터 8 미만까지
	}

}
