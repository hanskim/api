package api.io.reader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
	public static void main(String[] args) {
		
		//InputStreamReader isr = new InputStreamReader(System.in) ;
		//BufferedReader in = new BufferedReader(isr);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)) ;
		System.out.println("������ �Է��ϼ���");
		String str = " " ; 
		
		try {
			str =in.readLine() ;  // �ܼ�â�� ���� �Է��� �� �ִ�.
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
