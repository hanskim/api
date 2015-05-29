package api.util.vector;

public class GradeScenario {
	/* 성적표 벡터로 작성하기 코딩 시나리오
	 * 
	 * 1 VO , Interface  클래스 다이어그램을 받아든다. 본인이 작성했던 오더를 받았건 일단 본인ㅇ이 작성하지 않아서 잘 모르는 상황이라는 설정
	 * 혹은 본인이 하더라도 짐작가는대로 설정한 기능이라는 가정 하에
	 * 2.VO getter, setter ,,, implements를 구현한다
	 * 3. 보니까 기능 중 total 을 구현하는게 필요하니까
	 * 필드에 과목 점수가 있ㄱ.ㅣ에
	 * 그냥  VO 에서 기능을 넣는다. 이 정도 유연성은 개발자에게 있다.
	 * 
	 * 3. VO 완성하고  impls로 간다
	 * 4. 여기에 주석을 자신의 방식대로 적는다
	 * 
	 * ex1. Input ()  // 학생별로 성적을 입력을 받아서 저장할 공간을 확보해야함
	 *                // 동적으로 늘어나야하니까 배열은 일단 배제   -> Vector 또는 ArrayList 로 구현해야함
	 *                
	 * 5. 각 메소드에 기능에 대한 구현 계획 세울 것
	 *    각 메소드의 return 타입 고려하여 
	 *    ex >  SearchGradeByHak : 리턴이 String  + for loop + 내부 if
	 *          SearchGradeByName  :리턴   Vector  여러개의 매개변수가 처리되야함  + for loop + 내부 if
	 *          descGradeTotal()   : 내림차순 : Collection.sort  사용하면 됨
	 *          ascGradeTotal() : 오름차순 : Array.sort  사용하면 됨
	 *  
	 */

}
