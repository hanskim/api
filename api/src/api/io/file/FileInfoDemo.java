package api.io.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class FileInfoDemo {
	public static void main(String[] args) {
		System.out.println("���� �̸��� �������� : ");
		String name = null  ;    // ���������� �ʱ�ȭ �ض�.. ���� ������ �ؿ� �Ű������� �� �� ����
		
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			name = in.readLine() ; 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		File file = new File(name) ;
		if (file.exists()) {
			System.out.println("�����̸� : " + file.getName()) ;
			System.out.println("���ϰ�� : " + file.getPath()) ;
			System.out.println("���Ͼ��Ⱑ�ɿ��� : " + file.canWrite()) ;
			System.out.println("�����бⰡ�ɿ��� : " + file.canRead()) ;
			System.out.println("���ϱ��� : " + file.length()+"����Ʈ" );
			
		} else {
		}
	}
	

}
