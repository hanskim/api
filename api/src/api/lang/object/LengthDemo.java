package api.lang.object;
/*
 * java.lang.String�� ���� �޼ҵ�
 * length()  : String ���ڿ��� ���̸� ���ϴ� �޼ҵ�
 */

public class LengthDemo {
	public static void main(String[] args) {
		String tmp = "�ڹ� api  �н�" ; 
		int len  = tmp.length();
		char[] tmchararr = new char[len] ; 
		char[] chararr = new char[len] ; 
		
		for (int i = 0; i < len; i++) {
			tmchararr[i] =tmp.charAt(i);
		}
		//reverse
		for (int j = 0; j < len; j++) {
			chararr[j] =tmchararr[len-1-j];

		}
		
		String reverseTmp = new String(chararr) ; 
		System.out.println(reverseTmp);
		
		
	}

}
