package api.util.vector;

import java.util.Vector;

public class GradeServiceImpl implements GrandeService {
	
	/* 메소드 마다 공유하는 다수의 값이 필요한데 자료형? 반환값은 ? 
	 *   => 미정 
	 * -=> 이를 위해 컬렉션이 필요함 (
	 * => 무슨 컬렉션 ?? 일단 Vector 는 하나를 받는놈  ArrayList 여러개 처리 가능  선택은  ? 
	 * 일단 Vector로 구현
	 * 
	 */
	private Vector<GradeVO> vc = new Vector<GradeVO>( );
	// 최초에는 String  => 밑에 보니 타입이 GradeVO니까 타입 변경 
	
	GradeVO vo = new GradeVO();

	//private Vector<GradeVO> vc = new Vector<GradeVO>();
	
	// 학생 별 성적 입력받는 메소드
	@Override
	public void Input(GradeVO vo) {
		vc.add(vo);
		System.out.println("");
	}
	
    // vo  객체를 만들어서 출력하는 메소드
	// 지역변수 vs 필드 중 어디에 ? 
	// vo.toString()으로 처리할 것!
	@Override
	public void Print() {
		//GradeVO vo = new GradeVO();  // 예를 지역에 만들까 필드에 만들까
		//vc.toString();
		System.out.println(vc.toString());
	}
	

	// 학번(hak)으로 성적을 검색하는 기능을 가진 메소드
	// vector는 싸이즈()로 리스트를 표시함
	@Override
	public String SearchGradeByHak(String hak) {

		String msg = "";   // 지역변수니까 초기화
		
		for (int i = 0; i < vc.size(); i++) {
			String myHak = vc.elementAt(i).getHak() ;  // myHak은 벡터에서 i번째 요소에서 학번을 리턴 String
			System.out.println("파라미터학점 : " +hak);
			System.out.println("나의 학점 : " + hak);
			if(hak.equalsIgnoreCase(myHak)){            //  비교하여 같으면 .... 처리되는 소스
			msg =myHak ; 
			break;
			
		}else{
		 msg =" 조회하는 학번이 없습니다.";	
		}
			
		}

		return msg ;
	}

	// 이름(name)으로 성적을 검색해서 출력하는 메소드
	@Override
	public Vector<String> SearchGradeByName(String name) {
		String l = ""; // 지역변수니까 초기화

		Vector<String> local = new Vector<String>();

		for (int i = 0; i < vc.size(); i++) {
			String myName = vc.elementAt(i).getName(); 
			// myHak은 벡터에서 i번째 요소에서
		    // 학번을
		    // 리턴 String

			if (name.equalsIgnoreCase(myName)) { // 비교하여 같으면 .... 처리되는 소스
				local.add(name);
				break;

			} else {
				local.add("");
				
			}
			
		}

		return local;

	}

	// 총합(GradeToTal)을 기준으로 내림차순(Descending) 정렬
	// Collection.sort()사용함
	@Override
	public void DescGradeTotal() {
		// TODO Auto-generated method stub

	}

	// 총합(GradeToTal)을 기준으로 오름차순(ascending) 정렬
	//ArrayList.sort() 사용함
	@Override
	public void AscGradeTotal() {
		
		
		

	}

}
