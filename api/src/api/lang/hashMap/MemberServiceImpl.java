package api.lang.hashMap;

import java.util.HashMap;
import java.util.Map;

public class MemberServiceImpl implements MemberSerive {

	// 회원가입 기능 메소드
	// HashMap 을 해야 id 값을 가지고 password를 호출 가능
	// Map 계열 콜렉션은 중복제거(set)과 순차정력 (list)를 쓰고나서 결국 Map에 담긴다.
	// (why ? 키로 검색하기에 매우 빠름) => 그래서 콜렉션을[ 참조자료형 배열] 이라고 보면 됨!!
	//

	MemberVO vo = new MemberVO(); // 아래 두개의 메소드가 이 객체를 공유하기 위해 필드에 생성
	Map<String, Object> map = new HashMap<String, Object>();

	// 다른 메소드들이 이 객체를 공유하기 위해
	// Map은 주소가 없는 형태이고 Hash가 붙었다는 것은 단축된 값이 주소값을 갖는다

	@Override
	public void join(String id, String password, String name, int age,
			String addr) {
		vo.setId(id);
		vo.setPassword(password);
		vo.setName(name);
		vo.setAge(age);
		vo.setAddr(addr);
		// 위 패턴은 DB에 저장하는 기능과 동일 , 중간에 값이 변질(오염)되는 것을 방지하기 위해 1순위로 DB에 저장하고 본다.
		// 각각의 항목이 key 값이 됨.
		// 이후, DB에 있는 값을 후에 신규 로그인 시 입력되는 값과 비교하기 위해서 콜렉션(Map)이 필요
		// 뭘 담을까 고민되면 그냥 Map을 써라!!
		// 여기까지 하면 가입은 끝난다.
		//1.첫번째 에러유형
		// vo.getId() ,vo.getPassword()  쌍으로 움직임
		
		// 맵에 담는다. why? 입력한 값을 가지고 무언가 하기 위해
		map.put("id", vo.getId()); // 키는 고정값의 속성을 갖고 있어야 함. / "id"라는 String타입을// 줘야함
									
		map.put("password", vo.getPassword());
		map.put("name", vo.getName());
		map.put("age", String.valueOf(vo.getAge())); // String 타입으로 통일시키기 위해
												     // int를 String 타입으로 변환
		map.put("addr", vo.getAddr());
		
		//2.번째 에러유형  map.put("String" , VO) 
	


	}

	// 회원 가입 중 로그인 담당
	// 별다른 기능이 없으니까ㅓ... 로그인 성공, 실패 메세지까지 여기에서 마감.
	// 출력문 예시
	// 출력문 예시 1 . 입력하신 ID는 존재하지 않거나 일치하지 않습니다.
	// 출력문 예시 2 . 비번이 다릅니다. 다시 입력하세요
	// 환영합니다. xxxx에 사는 OOOO 님 . . .

	@Override
	public void login(String id, String password) {
		
		// 에러유형 3번째 : 파라미터는 반드시 변수처리

		if (map.get("id").equals(id) && map.get("password").equals(password)) {
			System.out.println("환영합니다." + vo.getAddr() + "에 사시는" + vo.getName()
					+ "님!!");
		} else if (!(map.get("id").equals(id)
				&& map.get("password").equals(password))) {
			System.out.println("입력하신 아이디 존재하지 않습니다.!");
		} else {
			System.out.println("비번이 다릅니다.");
		}
	}

}
