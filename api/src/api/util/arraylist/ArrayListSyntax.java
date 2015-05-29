package api.util.arraylist;

/*
 * java.util.ArrayList는  Object배열을 이용하여  데이터를 순차적으로 저장하는 공간
 * 
 * 첫번째로 저장한 공간은 인덱스 0 
 * 입력받다가 저장할 공간 없으면 새로운 배열을 생성하여 기존의 배열에 저장된 내용을 새로운 배열에 복사한 다음 저장한다
 * 
 * java.Vector와의 차이점
 * 벡터는 멀티쓰레드에 대한 동기화가 되어 있으나
 * java.util.ArrayList는 동기화가 되어있지 않다.
 * 
 * cf > 동기화   ≒   동시접속    ? 
 *      비동기화 = 랜덤으로 접속 가능하게 하는.. ≒  객체를 통해 움직이는 자바와 비슷... ? 
 *    
 * cf  > 쓰레드  ≒    PROCESSOR
 * 
 * ArrayList 클래스
 * ArrayList와 Vector class는 list를 크기 변경한 배열로 구성해놓은 것
 * Vector는 기본적으로 동기화 됨 , ArrayList는 그렇지 않음
 * 
 * 비동기화된 컬렉션은 동기화된 컬렉션보다 더 나은 성능(= 빠름) 제공
 * 쓰레드들이 컬렉션을 공유하지 않는 프로그램에 대해서는  ?? 
 * 일반적으로 ArrayList를 벡터보다 더 많이 씀 (/ 벡터보다 빠름 why ?  쓰레드 동기화에 따른 부담이 없음) 
 * 
 * 
 * 
 */

public class ArrayListSyntax {

	public static void main(String[] args) {

	}

}
