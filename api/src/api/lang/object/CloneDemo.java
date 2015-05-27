package api.lang.object;

import java.util.Arrays;

/* java.lang.Object 의 메소드 중
 * Clone은 객체를 복제한다
 * 
 * 
 */

public class CloneDemo {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		// 배열은 공간 할당되면 추가 할당 안됨
		// 동적으로 할당하려면 ArrayList 사용 필!
		
		int[] arr2 = arr.clone();
		// arr배열을 복제한 값을 arr2에 그대로 할당한다

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t"); // \t는 escape문자로 tab을 의미
		}

		System.out.println("");

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr[i] + "\t"); // \t는 escape문자로 tab을 의미
		}

		System.out.println("===============");
		System.out.println("Arrays로 출력 : ");
		System.out.println("arr 요소 출력 : " + Arrays.toString(arr));
		System.out.println("arr2 요소 출력 : " + Arrays.toString(arr2)); // for문도  필요없음.
																		

	}

}
