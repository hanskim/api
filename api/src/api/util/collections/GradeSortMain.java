package api.util.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GradeSortMain {

	public static void main(String[] args) {
		
		List<GradeVO> grade = new ArrayList<GradeVO>( );
		GradeVO g1 = new GradeVO("2011","ȫ�浿",90,8,70);
		GradeVO g2 = new GradeVO("2011","��浿",60,80,70);
		GradeVO g3 = new GradeVO("2011","�ڱ浿",80,80,7);
		GradeVO g4 = new GradeVO("2011","���浿",100,100,100);
		
		grade.add(g1);
		grade.add(g2);
		grade.add(g3);
		grade.add(g4);
		grade.add(new GradeVO("2011","��浿",60,80,70));
		// anonymous Ÿ�� //
		
		System.out.println("�������� ����");
		
		
		Collections.sort(grade , new NameAsCompareImpl());
		for (GradeVO ggg  : grade) {
			System.out.println(ggg);
		}
		
		System.out.println("===================================");
		
		System.out.println("�̸� �������� ����");
		Collections.sort(grade, new NameDscCompareImpl());
		for (GradeVO ggg  : grade) {
			System.out.println(ggg);
		}
		
		System.out.println("===================================");
		System.out.println("���� �������� ����");
		Collections.sort(grade, new TotalAcsCompareImpl());
		for (GradeVO ggg  : grade) {
			System.out.println(ggg);
		}
		
		System.out.println("===================================");
		System.out.println("���� �������� ����");
		Collections.sort(grade, new TotalDescCompareImpl());
		for (GradeVO ggg  : grade) {
			System.out.println(ggg);
		}
		

	}

}
