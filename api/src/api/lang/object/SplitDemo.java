package api.lang.object;

import java.util.Arrays;

// split (String , int )  :  int ��ŭ ������ �ش�.  ������ ����Ʈ�� ��ü ����
// �迭 � (ArrayList����) �� ���� ��� ���. 

public class SplitDemo {
	public static void main(String[] args) {
		String fruit = "apple,banana,chery,orange";
		String[] fruits =fruit.split(",");
		for (int i = 0; i < fruits.length; i++) {
			System.out.print("\t"+ fruits[i]);
			
		}
		System.out.println("");
		System.out.println("split() ��°��");
		String[] fruits2 = fruit.split(",",2);
	
		System.out.println(Arrays.toString(fruits2));
		
		
	}

}
