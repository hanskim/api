package api.lang.object;

/* java.lang.Object 의 메소드 중
 * equals() 값이 같으지 여부 체크
 * 
 * 
 */



public class EqualsDemo {
	public static void main(String[] args) {
		Temp temp1 = new Temp(10);
		Temp temp2 = new Temp(10);
		String result = " " ;  // result초기화 이유 : (메인)메소드 안에 있는 지역변수 반드시 초기화 필!
		                       // 초기화 하지 않으면 call stack영역 안에 들어갈 수 없는, 존재하지 않는 값.
		
		if (temp1.equals(temp2)) {
			System.out.println( "temp1 과 temp2의 값이 같다 ");
		} else {
			System.out.println( "temp1 과 temp2의 값이 다르다 ");
		}
		// 투입되 값이 같은데 다르다고나오는 이유  : equals()는 해시코드 주소값을 비교하는 메소드다
		
		System.out.println("========================");
		// 삼항 연산자 = if else 대체 가능.
		result = temp1.equals(temp2)? "temp1 , temp2가 서로 같다" :"temp1 , temp2가 서로 다르다"; 
		System.out.println("생성자를 통해 생성된 참조변수 값의 비교 : " + result);
		 
		System.out.println("========================");
		temp2=temp1 ;     // 참조변수이기 때문에 주소값을 (서로 같게) 할당하는 거다.
		result = temp1.equals(temp2)? "temp1 , temp2가 서로 같다" :"temp1 , temp2가 서로 다르다"; 
		System.out.println("참조변수 사이 할당되 값 비교 : " + result);
	}
	

}

class Temp{
	int num ; 
	public Temp(int num) {
		this.num = num ; 
		// 상기 형태는 heap에 저장된 인스턴스 변수에 콜스택에 있는 num 지역 변수에 할당되 값을 인스터스변수에 넘겨주고
		// 지역변수 자신은 사라짐.
	}
}
