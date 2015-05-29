package api.util.vector;

import java.util.Vector;

public class GradeMain {

	public static void main(String[] args) {

		System.out.println("학번들의 성적입력");
		GradeVO vo1 = new GradeVO("1번", "홍길동", 10, 20, 30);
		GradeVO vo2 = new GradeVO("2번", "로빈훗", 40, 50, 60);
		GradeVO vo3 = new GradeVO("3번", "임꺽정", 70, 80, 90);

		// System.out.println(vo1);
		// System.out.println(vo2);
		// System.out.println(vo3);

		GrandeService service = new GradeServiceImpl();
		
		service.Input(vo1);
		service.Input(vo2);
		service.Input(vo3);
		service.Print();
		System.out.println("");
		
		String dummy = service.SearchGradeByHak("1번");
		System.out.println(dummy);
		
		Vector<String> temp = new Vector<String>();
		temp =service.SearchGradeByName("홍길동") ;
		System.out.println(temp);
		
		
		
	}

}
