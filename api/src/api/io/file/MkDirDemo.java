package api.io.file;

import java.io.File;

public class MkDirDemo {
	public static void main(String[] args) {
		// �������� making directory

		File f = null;
		boolean bool = false;

		try {
			f = new File("C:\\makedirectorytest");
			bool = f.mkdir();
			System.out.println("Directory created ?" + bool);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
