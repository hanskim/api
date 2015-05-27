package api.lang.object;

/* java.lang.Object �� �޼ҵ� ��
 * equals() ���� ������ ���� üũ
 * 
 * 
 */



public class EqualsDemo {
	public static void main(String[] args) {
		Temp temp1 = new Temp(10);
		Temp temp2 = new Temp(10);
		String result = " " ;  // result�ʱ�ȭ ���� : (����)�޼ҵ� �ȿ� �ִ� �������� �ݵ�� �ʱ�ȭ ��!
		                       // �ʱ�ȭ ���� ������ call stack���� �ȿ� �� �� ����, �������� �ʴ� ��.
		
		if (temp1.equals(temp2)) {
			System.out.println( "temp1 �� temp2�� ���� ���� ");
		} else {
			System.out.println( "temp1 �� temp2�� ���� �ٸ��� ");
		}
		// ���Ե� ���� ������ �ٸ��ٰ����� ����  : equals()�� �ؽ��ڵ� �ּҰ��� ���ϴ� �޼ҵ��
		
		System.out.println("========================");
		// ���� ������ = if else ��ü ����.
		result = temp1.equals(temp2)? "temp1 , temp2�� ���� ����" :"temp1 , temp2�� ���� �ٸ���"; 
		System.out.println("�����ڸ� ���� ������ �������� ���� �� : " + result);
		 
		System.out.println("========================");
		temp2=temp1 ;     // ���������̱� ������ �ּҰ��� (���� ����) �Ҵ��ϴ� �Ŵ�.
		result = temp1.equals(temp2)? "temp1 , temp2�� ���� ����" :"temp1 , temp2�� ���� �ٸ���"; 
		System.out.println("�������� ���� �Ҵ�� �� �� : " + result);
	}
	

}

class Temp{
	int num ; 
	public Temp(int num) {
		this.num = num ; 
		// ��� ���´� heap�� ����� �ν��Ͻ� ������ �ݽ��ÿ� �ִ� num ���� ������ �Ҵ�� ���� �ν��ͽ������� �Ѱ��ְ�
		// �������� �ڽ��� �����.
	}
}
