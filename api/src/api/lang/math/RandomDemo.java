package api.lang.math;

import java.util.Scanner;

/* random() �޼ҵ�� ������ ������Ű�� ���
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
			System.out.println("1���� 5���� ���ڸ��߱� ����");
			System.out.println("����� " + i +"��° �õ�");
			System.out.println( "����� ������ ? :");
			myVal =scanner.nextInt() ; 
			if (myVal == com) {
				System.out.println("��ǻ�� �߻� ���� : " + com);
				System.out.println("����!!");
				break ; 
			}else{
				System.out.println("����!!");
			}
		}
		
	}

}
