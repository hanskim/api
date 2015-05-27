package api.lang.object;

public class EqualsDemo2 {
	public static void main(String[] args) {

		Person p1 = new Person("800000-1234567");
		Person p2 = new Person("800000-1234567");
		String result = "";   // static �޼ҵ� ���ζ� ���� �ʱ�ȭ �ʿ����.

		result = (p1 == p2) ? "���� ���� ���" : "���� �ٸ� ���";
		System.out.println("(p1 == p2) ������� :  " + result);
		System.out.println("==========================");

		result = (p1.equals(p2)) ? "���� ���� ���" : "���� �ٸ� ���";
		System.out.println("p1.equals(p2) ������� :  " + result);

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
			// java.lang.Object�� ĳ������ ((��üŸ��)obj).�⺯ �����
			// ��ü ĳ���� ������ instanceof 
			// Object�� ��� Ÿ�� , �ֹι�ȣ�� ���� �ִ� person������ Ȯ���ؾ�..�� ����
		} else {
			return false;
		}
	}

}
