package api.util.vector;

import java.util.Vector;

public interface GrandeService {
	

	public void Input(GradeVO vo);  // Ŭ������ �Ķ���ͷ� ���� ?

	public void Print();   

	public String SearchGradeByHak(String hak);

	public Vector<String> SearchGradeByName(String name);

	public void DescGradeTotal();

	public void AscGradeTotal();

}
