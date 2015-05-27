package api.lang.object;

public class EqualsDemo2 {
	public static void main(String[] args) {

		Person p1 = new Person("800000-1234567");
		Person p2 = new Person("800000-1234567");
		String result = "";   // static 메소드 내부라 굳이 초기화 필요없다.

		result = (p1 == p2) ? "둘은 같은 사람" : "둘은 다른 사람";
		System.out.println("(p1 == p2) 결과값은 :  " + result);
		System.out.println("==========================");

		result = (p1.equals(p2)) ? "둘은 같은 사람" : "둘은 다른 사람";
		System.out.println("p1.equals(p2) 결과값은 :  " + result);

	}
}

class Person {
	private String ssn;

	public Person(String ssn) {
		this.ssn = ssn;
	}

	// alt+shit +s generate getter, setter
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	// alt+shit +s generate hashcode and equals

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Person) {
			return ssn == ((Person) obj).ssn;
			// java.lang.Object의 캐스팅은 ((객체타입)obj).멤변 방식으
			// 객체 캐스팅 연산자 instanceof 
			// Object는 모든 타입 , 주민번호를 갖고 있는 person인지를 확인해야..비교 가능
		} else {
			return false;
		}
	}

}
