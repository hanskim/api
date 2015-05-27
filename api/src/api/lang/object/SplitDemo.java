package api.lang.object;

import java.util.Arrays;

// split (String , int )  :  int 만큼 공백을 준다.  없으면 디폴트로 전체 공백
// 배열 등에 (ArrayList포함) 에 나눠 담는 기능. 

public class SplitDemo {
	public static void main(String[] args) {
		String fruit = "apple,banana,chery,orange";
		String[] fruits =fruit.split(",");
		for (int i = 0; i < fruits.length; i++) {
			System.out.print("\t"+ fruits[i]);
			
		}
		System.out.println("");
		System.out.println("split() 출력결과");
		String[] fruits2 = fruit.split(",",2);
	
		System.out.println(Arrays.toString(fruits2));
		
		
	}

}
