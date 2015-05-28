package api.util.vector;

import java.util.Vector;

public class GradeServiceImpl implements GrandeService {

	@Override
	public void Input(GradeVO vo) {
		// TODO Auto-generated method stub
		//
	}

	//성적표를 출력하는 메소드
	//vo.toString()으로 처리할 것!
	@Override
	public void Print() {
		
	}

	// 학번(hak)으로 성적을 검색하는 기능을 가진 메소드
	@Override
	public String SearchGradeByHak(String hak) {
		return null;
	}

	// 이름(name)으로 성적을 검색해서 출력하는 메소드
	@Override
	public Vector<String> SearchGradeByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	
	// 총합(GradeToTal)을 기준으로 내림차순(Descending) 정렬
	@Override
	public void DescGradeTotal() {
		// TODO Auto-generated method stub
		
	}
	// 총합(GradeToTal)을 기준으로 오름차순(ascending) 정렬
	@Override
	public void AscGradeTotal() {
		// TODO Auto-generated method stub
		
	}

	

}
