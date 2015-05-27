package api.lang.object;
/*
 * java.lang.String에 속한 메소드
 * length()  : String 문자열의 길이를 구하는 메소드
 */

public class LengthDemo {
	public static void main(String[] args) {
		String tmp = "자바 api  학습" ; 
		int len  = tmp.length();
		char[] tmchararr = new char[len] ; 
		char[] chararr = new char[len] ; 
		
		for (int i = 0; i < len; i++) {
			tmchararr[i] =tmp.charAt(i);
		}
		//reverse
		for (int j = 0; j < len; j++) {
			chararr[j] =tmchararr[len-1-j];

		}
		
		String reverseTmp = new String(chararr) ; 
		System.out.println(reverseTmp);
		
		
	}

}
