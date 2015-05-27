package api.lang.object;

// import java.lang.Object ; �������� �ʾƵ� default�� import�Ǿ� ���� " 

public class TostringDemo {
	public static void main(String[] args) {
		Card card1 = new Card("spade", 7 );
		Card card2 = new Card("heart", 2 );
		System.out.println(card1.toString());
		System.out.println(card2.toString());
		
		//toString �� �⺻������ ��ü �ּҰ��� �����ϹǷ� toString �������̵� (������) �ʿ�
		
		
	}
}

 // �ڹ����Ͽ� 2���̻��� ������ ������ �� ������ public�� ���� �Ѱ�
class Card{
	String kind ; 
	int number ; 
	public Card() {
		this("",0) ; 
	}
	//������ �����ε�  : ����Ʈ ������ ���� �� + ctrl + space 
	// ������ �����ڸ� ȣ���ϴ��� �Ķ���Ͱ� �ִ� �����ڱ��� ȣ�������
	// ������ ������� �� �ʿ� ���� ��� ����./
	
	public Card(String kind, int number) {
		this.kind = kind ; 
		this.number = number ; 
	}
	//getter, setter  �ʿ�� ����

	@Override
	public String toString() {
		return "Card [����=" + kind + ", ����=" + number + "]";
	}


	
	//Ctrl +space���� toString�� ����� �ϵ��ڵ� ���� �þ��.
	//alt +shift +s   , Generate toString ����
	
	
	
	
	
	
}
