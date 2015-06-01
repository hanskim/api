package api.lang.hashMap;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		
		System.out.println("아이디 입력란  : ");
		String id = scan.next() ; 
		System.out.println("비번 입력란 : ");
		String password = scan.next() ; 
		System.out.println("이름 입력란 : ");
		String name = scan.next() ; 
		System.out.println("나이 입력란 : ");
		int age = scan.nextInt() ; 
		System.out.println("주소 입력란 : ");
		String addr = scan.next() ; 
		System.out.println("");
		
		/*
		 * 객체를 생성하여 완료
		 * 
		 */
		
		// 더미값 입력 을 위해 객체 생성 why ?  객체가 불러오는 메소드를 활용하기 위해
		MemberSerive serive = new MemberServiceImpl( );
		serive.join("go", "pass", "gozial", 20, "서울시");
		
		
		System.out.println("회원 가입이 되었습니다. ");
		System.out.println("로그인 해주세요. ");
		
		System.out.println("id를 입력해주세요. ");
		id =scan.next();
		System.out.println("비번을 입력해주세요. ");  
		password =scan.next();            // 비번 입력 후  impl에서 
		
		serive.login(id, password);
		

	}

}
