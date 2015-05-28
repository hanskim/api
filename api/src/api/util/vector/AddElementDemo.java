package api.util.vector;

import java.util.Vector;

/*java.util.Vector의 메소드인
addElement()는 기본적으로 add()와 동일하다.*/


public class AddElementDemo {
	public static void main(String[] args) {
		String[] heros = {"iron","thor","hansik","changgu"} ;
		Vector<String> avengers = new Vector<String>() ; 
		//백테어 배열의 요소를 저정
		for (int i = 0; i < heros.length; i++) {
			avengers.addElement(heros[i]);
			
		}
		//토르가 존재하는지 체크  : contains 메소드 이용
		String thor = "thor" ; 
		if (avengers.contains(thor)) {
			int idx = avengers.indexOf(thor);
			System.out.println("토르는" + idx + "번째에 있습니다");
		} else {
			System.out.println("토르는 없습니다.");

		}
		//첫번째 멤버요소 삭제
		
		System.out.println("===========================");
		avengers.removeElementAt(0);
		System.out.println("삭제 후 멤버 위치 인덱스 변화");
		for (int j = 0; j < avengers.size(); j++) {
			System.out.println("avengers 의 " +(j+1)+ "번째 멤버는 : " +avengers.elementAt(j));
			
		}
	}
	

}
