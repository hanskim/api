package api.io.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class FileInfoDemo {
	public static void main(String[] args) {
		System.out.println("파일 이름을 넣으세요 : ");
		String name = null  ;    // 지역변수는 초기화 해라.. 하지 않으면 밑에 매개변수로 들어갈 때 오류
		
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			name = in.readLine() ; 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		File file = new File(name) ;
		if (file.exists()) {
			System.out.println("파일이름 : " + file.getName()) ;
			System.out.println("파일경로 : " + file.getPath()) ;
			System.out.println("파일쓰기가능여부 : " + file.canWrite()) ;
			System.out.println("파일읽기가능여부 : " + file.canRead()) ;
			System.out.println("파일길이 : " + file.length()+"바이트" );
			
		} else {
		}
	}
	

}
