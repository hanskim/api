package api.lang.math;

import java.util.Scanner;

/* random() 메소드는 난수를 생성시키는 기능
 * 
 */

public class RandomDemo {
	public static void main(String[] args) {
		int com = (int) ((Math.random()*5)+1);
		
		int myVal ; 
		Scanner scanner = new Scanner(System.in);
		int i =0 ; 
		while (true) {
			i++ ; 
			System.out.println("1부터 5까지 숫자맞추기 게임");
			System.out.println("현재는 " + i +"번째 시도");
			System.out.println( "당신의 선택은 ? :");
			myVal =scanner.nextInt() ; 
			if (myVal == com) {
				System.out.println("컴퓨터 발생 숫자 : " + com);
				System.out.println("정답!!");
				break ; 
			}else{
				System.out.println("오답!!");
			}
		}
		
	}

}
