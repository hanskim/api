package api.lang.hashMap;

import java.util.HashMap;
import java.util.Map;

public class MemberServiceImpl implements MemberSerive {

	// ȸ������ ��� �޼ҵ�
	// HashMap �� �ؾ� id ���� ������ password�� ȣ�� ����
	// Map �迭 �ݷ����� �ߺ�����(set)�� �������� (list)�� ������ �ᱹ Map�� ����.
	// (why ? Ű�� �˻��ϱ⿡ �ſ� ����) => �׷��� �ݷ�����[ �����ڷ��� �迭] �̶�� ���� ��!!
	//

	MemberVO vo = new MemberVO(); // �Ʒ� �ΰ��� �޼ҵ尡 �� ��ü�� �����ϱ� ���� �ʵ忡 ����
	Map<String, Object> map = new HashMap<String, Object>();

	// �ٸ� �޼ҵ���� �� ��ü�� �����ϱ� ����
	// Map�� �ּҰ� ���� �����̰� Hash�� �پ��ٴ� ���� ����� ���� �ּҰ��� ���´�

	@Override
	public void join(String id, String password, String name, int age,
			String addr) {
		vo.setId(id);
		vo.setPassword(password);
		vo.setName(name);
		vo.setAge(age);
		vo.setAddr(addr);
		// �� ������ DB�� �����ϴ� ��ɰ� ���� , �߰��� ���� ����(����)�Ǵ� ���� �����ϱ� ���� 1������ DB�� �����ϰ� ����.
		// ������ �׸��� key ���� ��.
		// ����, DB�� �ִ� ���� �Ŀ� �ű� �α��� �� �ԷµǴ� ���� ���ϱ� ���ؼ� �ݷ���(Map)�� �ʿ�
		// �� ������ ��εǸ� �׳� Map�� ���!!
		// ������� �ϸ� ������ ������.
		//1.ù��° ��������
		// vo.getId() ,vo.getPassword()  ������ ������
		
		// �ʿ� ��´�. why? �Է��� ���� ������ ���� �ϱ� ����
		map.put("id", vo.getId()); // Ű�� �������� �Ӽ��� ���� �־�� ��. / "id"��� StringŸ����// �����
									
		map.put("password", vo.getPassword());
		map.put("name", vo.getName());
		map.put("age", String.valueOf(vo.getAge())); // String Ÿ������ ���Ͻ�Ű�� ����
												     // int�� String Ÿ������ ��ȯ
		map.put("addr", vo.getAddr());
		
		//2.��° ��������  map.put("String" , VO) 
	


	}

	// ȸ�� ���� �� �α��� ���
	// ���ٸ� ����� �����ϱ��... �α��� ����, ���� �޼������� ���⿡�� ����.
	// ��¹� ����
	// ��¹� ���� 1 . �Է��Ͻ� ID�� �������� �ʰų� ��ġ���� �ʽ��ϴ�.
	// ��¹� ���� 2 . ����� �ٸ��ϴ�. �ٽ� �Է��ϼ���
	// ȯ���մϴ�. xxxx�� ��� OOOO �� . . .

	@Override
	public void login(String id, String password) {
		
		// �������� 3��° : �Ķ���ʹ� �ݵ�� ����ó��

		if (map.get("id").equals(id) && map.get("password").equals(password)) {
			System.out.println("ȯ���մϴ�." + vo.getAddr() + "�� ��ô�" + vo.getName()
					+ "��!!");
		} else if (!(map.get("id").equals(id)
				&& map.get("password").equals(password))) {
			System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�.!");
		} else {
			System.out.println("����� �ٸ��ϴ�.");
		}
	}

}
