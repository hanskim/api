package api.lang.object;

// import java.lang.Object ; 선언하지 않아도 default로 import되어 있음 " 

public class TostringDemo {
	public static void main(String[] args) {
		Card card1 = new Card("spade", 7 );
		Card card2 = new Card("heart", 2 );
		System.out.println(card1.toString());
		System.out.println(card2.toString());
		
		//toString 은 기본적으로 객체 주소값을 리턴하므로 toString 오버라이딩 (재정의) 필요
		
		
	}
}

 // 자바파일에 2개이상의 파일이 존재할 수 있으나 public은 오직 한개
class Card{
	String kind ; 
	int number ; 
	public Card() {
		this("",0) ; 
	}
	//생성자 오버로딩  : 디폴트 생성자 생성 후 + ctrl + space 
	// 디폴드 생성자를 호출하더라도 파라미터가 있는 생성자까지 호출됨으로
	// 생성자 내용까지 알 필요 없이 사용 가능./
	
	public Card(String kind, int number) {
		this.kind = kind ; 
		this.number = number ; 
	}
	//getter, setter  필요시 생성

	@Override
	public String toString() {
		return "Card [무늬=" + kind + ", 숫자=" + number + "]";
	}


	
	//Ctrl +space에서 toString을 만들면 하드코딩 양이 늘어난다.
	//alt +shift +s   , Generate toString 실행
	
	
	
	
	
	
}
