package api.io.file;

import java.awt.image.DirectColorModel;
import java.io.File;

/* java.io.File 의 메소드 안
 * isFile()  // 해당 파일이 있는지 여부를 확인. 없으면  false
 * isDirectory  // 해당 패스에 디렉토리(폴더)가 존재하는지 , 없으면  false
 * 
 * 
 * 디렉토리  vs 폴더   : 기본적으로 비슷한 개념
 * 디렉토리  :  텍스트모드로  cmd 창에서 경로 구분시에 의미
 * 폴더   : GUI 모드에서 파일을 넣어 주는 곳의 의미
 *        실제로 폴더라는 말 그 자체가 Window 3.5이상의 버젼에서 등장 , 그건 DOS 모드에서 는 디렉토리란 말을 썼다.
 * 
 * 
 */

public class IsDirectoryDemo {
	public static void main(String[] args) {
		// String dirctory = "c:\temp" ;
		String dirctory = "C:\\fileinfotest";
		File file = new File(dirctory);
		String directory2 = "c:" + File.separator + "fileinfotest";
		
		

		if (file.isDirectory()) {
			System.out.println("검색 디렉토리  : " + dirctory);
			System.out.println("디렉토리 내부파일 목록 ");
			String str[] = file.list();
			for (int i = 0; i < str.length; i++) {
				File file2 = new File(dirctory + "\\" + str[i]);
				if (file2.isDirectory()) {
					System.out.println(str[i] + "디렉토리");
				} else {
					System.out.println(str[i] + "파일");
				}
			}
		} else {
			System.out.println("지정한 " + dirctory + "는 디렉토리가 아님");
		}

		System.out.println("==================================");

		if (file.isDirectory()) {
			System.out.println("검색 디렉토리  : " + directory2);
			System.out.println("디렉토리 내부파일 목록 ");
			String str[] = file.list();
			for (int i = 0; i < str.length; i++) {
				File file2 = new File(directory2 + "\\" + str[i]);
				if (file2.isDirectory()) {
					System.out.println(str[i] + "디렉토리");
				} else {
					System.out.println(str[i] + "파일");
				}
			}
		} else {
			System.out.println("지정한 " + dirctory + "는 디렉토리가 아님");

		}

	}

}
