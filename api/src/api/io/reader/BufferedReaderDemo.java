package api.io.reader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
	public static void main(String[] args) {
		
		//InputStreamReader isr = new InputStreamReader(System.in) ;
		//BufferedReader in = new BufferedReader(isr);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)) ;
		System.out.println("문장을 입력하세요");
		String str = " " ; 
		
		try {
			str =in.readLine() ;  // 콘솔창에 직접 입력할 수 있다.
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
