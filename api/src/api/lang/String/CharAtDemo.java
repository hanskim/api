package api.lang.String;

/* java.lang.String에 속한 메소드
 * charAt() ; 지정된 위치에 있는 문자열 리턴  , 0부터 시작
 * indexOf()  ;  주어진 문자가 존재하는지 확인 후 위치를 알려줌  / 없으면 -1 
 */

public class CharAtDemo {
	public static void main(String[] args) {
		String ssn = "801234-1234567" ; 
		//char isMan = ssn.charAt(7);
		/*
		 * 인덱스는 0부터 시작하니까 남녀 구분은 7번째 자리
		 */
		char isMan =ssn.charAt(ssn.indexOf("-")+1);
		//indexOf 는 파라미터로 주어진 String 값의 위치값 리턴 
		// charAt보다 indexOf많이 쓴다.
		
		switch (isMan) {
		case 1: case 3:  System.out.println("남성"); break;
		case 2: case 4:  System.out.println("여성"); break;
		default: System.out.println("입력오류"); break;
		
		}
	}

}
