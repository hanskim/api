package api.util.collections;

import java.util.Comparator;

public  class NameDscCompareImpl implements Comparator <GradeVO> {

	 // 이름을 내림차순으로 리턴 

	@Override
	public int compare(GradeVO first, GradeVO second) {
		
		return second.getName().compareTo(first.getName())  ;
	}

}
