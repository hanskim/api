package ControllerPattern;

import java.util.Scanner;

public class ControllerPatter {
	public static void main(String[] args) {
		ControllerPatter cp = new ControllerPatter( );
		Scanner scan = new Scanner( System.in);
		
		int flag = 0 ; 
		do {
			System.out.println( "���� ���α׷��� �Է��ϼ���");
			System.out.println( "�Է��� ��ġ���� 0�Է��ϼ���");
			
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
