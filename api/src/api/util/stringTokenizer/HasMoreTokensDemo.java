package api.util.stringTokenizer;

import java.util.StringTokenizer;

public class HasMoreTokensDemo {

	public static void main(String[] args) {

		/*
		 * ������ Ȥ�� ���� ��� ������ token�̶�� �� Ư�� �����ڸ� �����ϸ� �װ��� ������� �߶󳻴� Ŭ������ �޼ҵ�
		 */

		String date = " 2015 / 05/ 24 ";
		StringTokenizer tok = new StringTokenizer(date.trim() , "/", true);

		int idx = 0;

		/*
		 * while ģ �� enumeration => hasMoreTokens
		 */

		while (tok.hasMoreTokens()) {
			String token = tok.nextToken();
			System.out.println("[" + idx + "]" + token);
			idx++;
		}

	}

}
