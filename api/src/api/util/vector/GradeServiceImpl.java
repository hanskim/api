package api.util.vector;

import java.util.Vector;

public class GradeServiceImpl implements GrandeService {
	
	/* �޼ҵ� ���� �����ϴ� �ټ��� ���� �ʿ��ѵ� �ڷ���? ��ȯ���� ? 
	 *   => ���� 
	 * -=> �̸� ���� �÷����� �ʿ��� (
	 * => ���� �÷��� ?? �ϴ� Vector �� �ϳ��� �޴³�  ArrayList ������ ó�� ����  ������  ? 
	 * �ϴ� Vector�� ����
	 * 
	 */
	private Vector<GradeVO> vc = new Vector<GradeVO>( );
	// ���ʿ��� String  => �ؿ� ���� Ÿ���� GradeVO�ϱ� Ÿ�� ���� 
	
	GradeVO vo = new GradeVO();

	//private Vector<GradeVO> vc = new Vector<GradeVO>();
	
	// �л� �� ���� �Է¹޴� �޼ҵ�
	@Override
	public void Input(GradeVO vo) {
		vc.add(vo);
		System.out.println("");
	}
	
    // vo  ��ü�� ���� ����ϴ� �޼ҵ�
	// �������� vs �ʵ� �� ��� ? 
	// vo.toString()���� ó���� ��!
	@Override
	public void Print() {
		//GradeVO vo = new GradeVO();  // ���� ������ ����� �ʵ忡 �����
		//vc.toString();
		System.out.println(vc.toString());
	}
	

	// �й�(hak)���� ������ �˻��ϴ� ����� ���� �޼ҵ�
	// vector�� ������()�� ����Ʈ�� ǥ����
	@Override
	public String SearchGradeByHak(String hak) {

		String msg = "";   // ���������ϱ� �ʱ�ȭ
		
		for (int i = 0; i < vc.size(); i++) {
			String myHak = vc.elementAt(i).getHak() ;  // myHak�� ���Ϳ��� i��° ��ҿ��� �й��� ���� String
			System.out.println("�Ķ�������� : " +hak);
			System.out.println("���� ���� : " + hak);
			if(hak.equalsIgnoreCase(myHak)){            //  ���Ͽ� ������ .... ó���Ǵ� �ҽ�
			msg =myHak ; 
			break;
			
		}else{
		 msg =" ��ȸ�ϴ� �й��� �����ϴ�.";	
		}
			
		}

		return msg ;
	}

	// �̸�(name)���� ������ �˻��ؼ� ����ϴ� �޼ҵ�
	@Override
	public Vector<String> SearchGradeByName(String name) {
		String l = ""; // ���������ϱ� �ʱ�ȭ

		Vector<String> local = new Vector<String>();

		for (int i = 0; i < vc.size(); i++) {
			String myName = vc.elementAt(i).getName(); 
			// myHak�� ���Ϳ��� i��° ��ҿ���
		    // �й���
		    // ���� String

			if (name.equalsIgnoreCase(myName)) { // ���Ͽ� ������ .... ó���Ǵ� �ҽ�
				local.add(name);
				break;

			} else {
				local.add("");
				
			}
			
		}

		return local;

	}

	// ����(GradeToTal)�� �������� ��������(Descending) ����
	// Collection.sort()�����
	@Override
	public void DescGradeTotal() {
		// TODO Auto-generated method stub

	}

	// ����(GradeToTal)�� �������� ��������(ascending) ����
	//ArrayList.sort() �����
	@Override
	public void AscGradeTotal() {
		
		
		

	}

}
