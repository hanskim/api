package api.lang.stringBuffer;

/*StringBuffer Ŭ����
 * String�� �ٸ����� �ν��Ͻ� ���� �� ���ڿ��� �ٲ� �� �ճ� ������ ����
 * 
 * java.lang.StringBuffer�� �޼ҵ���  append()  �� �Ķ���ͷ� ���� String ����
 * ���� ���ڿ��� �ڿ� ���δ�.
 * 
 */

public class AppendDemo {
	public static void main(String[] args) {

		StringBuffer buffer1 = new StringBuffer( );
		StringBuffer buffer2 = new StringBuffer("A B C");
		StringBuffer buffer3 = buffer2.append(" D E F");   
		// ���ڿ��� ��ġ�� concat �� �����ϳ� Stringbuffer ���� ���
		// concat �� �������� �ΰ��� string�� ������ŭ �޸𸮸� �Ҵ��Ͽ� ��ġ�� ���
		// append �� �������� �ϳ����� ��ġ�� ���
		String msg ; 
		
		if (buffer1 == buffer2) {
			msg = "buffer1 == buffer2" ;
		} else {
			msg = "buffer1 != buffer2" ;
		}
		
		System.out.println(msg);
		System.out.println(buffer2.toString());
		System.out.println(buffer3.toString());
		
		// buffer2 �� ���Ӱ� �����Ǿ� ���޵� ��ü �ƴ�
		// buffer1 �� ���������� �����Ǿ� ���� ��������
		// ������ �ּҰ��� �����Ѵ�
		
		// StringBuffer Ŭ������ String  Ŭ�����ʹ� �ٸ���
		/*���к��ϰ� ��ü ������ ���� ������ ���� ���� �����ϴ�
		���� ��ȯ�� ���ڿ� ���� �ʿ� �� StringBuffer Ŭ���� ����
	     ex  > ī�� ���� ���� �� �ۼ��Ϸ�� ���常 ������ */
		

	}
}
