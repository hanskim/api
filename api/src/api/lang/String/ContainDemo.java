package api.lang.String;

/* java.lang.String에 속한 메소드
 * 
 * contain(s) : s라는 글자가 포함되었는 여부 체크
 */

public class ContainDemo {
	public static void main(String[] args) {
		String str = "adbcㄱdefd";
		
		System.out.println(str.contains("ㄱ")? "ㄱ포함 " : "ㄱ 미포함");
	}
}
