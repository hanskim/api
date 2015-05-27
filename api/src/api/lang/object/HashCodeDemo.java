package api.lang.object;

/* hashing 기법에 사용되는 hash메소드
 * 해싱은 다량의 데이터를 저장하고 검색하는데 사용되는 데이터 관리기법
 * ex . 트위터 해시태그   : 동일한 해시태그(주소)가 첨부된 게시글은 동일한 주소값 참조하여 빠른 검색결과 가능
 * 
 * 
 */

public class HashCodeDemo {
	public static void main(String[] args) {
		String abc = new String("abc");
		String abc2 = "abc";

		System.out.println("abc의 해시태그 : " + abc.hashCode());
		System.out.println("abc2의 해시태그 : " + abc2.hashCode());

		/*
		 * 결과 abc의 해시태그 : 96354 abc2의 해시태그 : 96354 String 타입은 new String
		 * ("abc")처럼 생성자를 통한 생성임으로, ""처럼 리터럴 형태의 생성이나 동일한 주소값을 가진다는 점을 알수 있다. 모든
		 * 객체중 String 만이 이러한 특성을 지닌다.
		 */

	}

}
