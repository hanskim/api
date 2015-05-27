package ControllerPattern;

import java.util.Scanner;

public class ControllerPatter {
	public static void main(String[] args) {
		ControllerPatter cp = new ControllerPatter( );
		Scanner scan = new Scanner( System.in);
		
		int flag = 0 ; 
		do {
			System.out.println( "진행 프로그램을 입력하세요");
			System.out.println( "입력을 마치려면 0입력하세요");
			
			flag = scan.nextInt() ; 
			switch (flag) {
			case 1 :
				
				break;

			default:
				break;
			}
			
		} while ( flag != 0);
		
	}
	

}
