package api.lang.stringBuffer;

/*StringBuffer 클래스
 * String과 다른점은 인스턴스 생성 시 문자열을 바꿀 수 잇냐 없냐의 차이
 * 
 * java.lang.StringBuffer의 메소드인  append()  는 파라미터로 들어온 String 값을
 * 원래 문자열의 뒤에 붙인다.
 * 
 */

public class AppendDemo {
	public static void main(String[] args) {

		StringBuffer buffer1 = new StringBuffer( );
		StringBuffer buffer2 = new StringBuffer("A B C");
		StringBuffer buffer3 = buffer2.append(" D E F");   
		// 문자열을 합치는 concat 과 유사하나 Stringbuffer 에서 사용
		// concat 은 합쳐지는 두개의 string이 갯수만큼 메모리를 할당하여 합치는 방식
		// append 는 합쳐지는 하나에서 합치는 방식
		String msg ; 
		
		if (buffer1 == buffer2) {
			msg = "buffer1 == buffer2" ;
		} else {
			msg = "buffer1 != buffer2" ;
		}
		
		System.out.println(msg);
		System.out.println(buffer2.toString());
		System.out.println(buffer3.toString());
		
		// buffer2 는 새롭게 생성되어 전달되 객체 아님
		// buffer1 이 내부적으로 수정되어 전달 받음으로
		// 동일한 주소값을 참조한다
		
		// StringBuffer 클래스는 String  클래스와는 다르게
		/*무분별하게 객체 생성을 하지 않으면 직접 수정 가능하다
		만얀 변환된 문자열 수정 필요 시 StringBuffer 클래스 유리
	     ex  > 카톡 문자 보낼 시 작성완료된 문장만 보내짐 */
		

	}
}
