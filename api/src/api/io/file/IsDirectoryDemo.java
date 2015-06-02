package api.io.file;

import java.awt.image.DirectColorModel;
import java.io.File;

/* java.io.File �� �޼ҵ� ��
 * isFile()  // �ش� ������ �ִ��� ���θ� Ȯ��. ������  false
 * isDirectory  // �ش� �н��� ���丮(����)�� �����ϴ��� , ������  false
 * 
 * 
 * ���丮  vs ����   : �⺻������ ����� ����
 * ���丮  :  �ؽ�Ʈ����  cmd â���� ��� ���нÿ� �ǹ�
 * ����   : GUI ��忡�� ������ �־� �ִ� ���� �ǹ�
 *        ������ ������� �� �� ��ü�� Window 3.5�̻��� �������� ���� , �װ� DOS ��忡�� �� ���丮�� ���� ���.
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
			System.out.println("�˻� ���丮  : " + dirctory);
			System.out.println("���丮 �������� ��� ");
			String str[] = file.list();
			for (int i = 0; i < str.length; i++) {
				File file2 = new File(dirctory + "\\" + str[i]);
				if (file2.isDirectory()) {
					System.out.println(str[i] + "���丮");
				} else {
					System.out.println(str[i] + "����");
				}
			}
		} else {
			System.out.println("������ " + dirctory + "�� ���丮�� �ƴ�");
		}

		System.out.println("==================================");

		if (file.isDirectory()) {
			System.out.println("�˻� ���丮  : " + directory2);
			System.out.println("���丮 �������� ��� ");
			String str[] = file.list();
			for (int i = 0; i < str.length; i++) {
				File file2 = new File(directory2 + "\\" + str[i]);
				if (file2.isDirectory()) {
					System.out.println(str[i] + "���丮");
				} else {
					System.out.println(str[i] + "����");
				}
			}
		} else {
			System.out.println("������ " + dirctory + "�� ���丮�� �ƴ�");

		}

	}

}
