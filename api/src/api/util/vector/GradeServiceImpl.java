package api.util.vector;

import java.util.Vector;

public class GradeServiceImpl implements GrandeService {

	@Override
	public void Input(GradeVO vo) {
		// TODO Auto-generated method stub
		//
	}

	//����ǥ�� ����ϴ� �޼ҵ�
	//vo.toString()���� ó���� ��!
	@Override
	public void Print() {
		
	}

	// �й�(hak)���� ������ �˻��ϴ� ����� ���� �޼ҵ�
	@Override
	public String SearchGradeByHak(String hak) {
		return null;
	}

	// �̸�(name)���� ������ �˻��ؼ� ����ϴ� �޼ҵ�
	@Override
	public Vector<String> SearchGradeByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	
	// ����(GradeToTal)�� �������� ��������(Descending) ����
	@Override
	public void DescGradeTotal() {
		// TODO Auto-generated method stub
		
	}
	// ����(GradeToTal)�� �������� ��������(ascending) ����
	@Override
	public void AscGradeTotal() {
		// TODO Auto-generated method stub
		
	}

	

}
