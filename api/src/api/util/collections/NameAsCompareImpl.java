package api.util.collections;

import java.util.Comparator;

public class NameAsCompareImpl implements Comparator<GradeVO> {

	@Override
	public int compare(GradeVO first, GradeVO second) {
		return  first.getName().compareTo(second.getName());
		
		// �ڿ� �ִ� ���� �� ���ڿ�
		
	}
	
	

}
