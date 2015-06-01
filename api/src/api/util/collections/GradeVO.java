package api.util.collections;

public class GradeVO {
	// 멤버 선언 시 동일한 타입은 같은 줄에 할 것!!
	// 1. 제일 처음 생성자부터 말들 것!!
	// 2.getter, setter 만들 것!!
	
	private String hak, name;
	private int kor, eng, math;
	
	
	public GradeVO() {  
		this("","",0,0,0);
	}
	
	

	public GradeVO(String hak, String name, int kor, int eng, int math) {
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}



	public String getHak() {   
		return hak;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	// 일반적으로 getter, setter하고 추가적으로 정의해도 무방
	// 국어 , 영어, 수학
	public int getTotal() {
		return this.kor + this.eng +this.math;
	}

	@Override
	public String toString() {
		return " 성적표 [학번=" + hak + ", 이름=" + name + ", 국어(kor)=" + kor
				+ ", 영어(eng)=" + eng + ", 수학(math)=" + math + ", 총점 : " +this.getTotal()+ "]"+"\n";
	}
	
	
	

}
