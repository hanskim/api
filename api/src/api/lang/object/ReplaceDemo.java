package api.lang.object;

/* replace 
 * 
 * 
 */

public class ReplaceDemo {
	public static void main(String[] args) {
		System.out.println( " Hello Tom".replace("Tom", "Alex"));
		System.out.println( "A B C D : A B C D".replaceAll(" C D", " E F"));
		
		/* 위 문법은 자바 버젼 5(jdk1.5) 까지의 문법
		 * 이후 기능 확대되어 replaceAll 기능 추가
		 * 복수의 글자도 반응
		 * 정규식에 대한 기능이 있는지 없는지에 대한 차이점  ??
		 * 
		 */
		
		System.out.println("[1] A B C D : A B C D ".replaceAll(" C D", " E F"));
		System.out.println("[2] A B C D : A B C D ".replaceAll(" C D", " E F"));
		
		System.out.println("================================================");
		
		System.out.println("[3]Hello Java !! ".replace("!", " "));
		System.out.println("[4]Hello Java !!!!! ".replaceAll(".!"	, " "));
		
		//.의 역할은 정규식에서 맨 앞의 한 글자만 지정
		// 이 기능은 replaceAll 만 가능
		// 따라서 정규식까지 처리 가능한 replaceAll을 더 많이 씀
		
		
		
	}

}
