package api.util.stringTokenizer;

import java.util.StringTokenizer;

public class HasMoreTokensDemo {

	public static void main(String[] args) {

		/*
		 * 구분자 혹은 문법 요소 단위를 token이라고 함 특정 구분자를 지정하면 그것을 기분으로 잘라내는 클래스와 메소드
		 */

		String date = " 2015 / 05/ 24 ";
		StringTokenizer tok = new StringTokenizer(date.trim() , "/", true);

		int idx = 0;

		/*
		 * while 친 후 enumeration => hasMoreTokens
		 */

		while (tok.hasMoreTokens()) {
			String token = tok.nextToken();
			System.out.println("[" + idx + "]" + token);
			idx++;
		}

	}

}
