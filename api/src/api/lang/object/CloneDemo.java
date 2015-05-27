package api.lang.object;

import java.util.Arrays;

/* java.lang.Object �� �޼ҵ� ��
 * Clone�� ��ü�� �����Ѵ�
 * 
 * 
 */

public class CloneDemo {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		// �迭�� ���� �Ҵ�Ǹ� �߰� �Ҵ� �ȵ�
		// �������� �Ҵ��Ϸ��� ArrayList ��� ��!
		
		int[] arr2 = arr.clone();
		// arr�迭�� ������ ���� arr2�� �״�� �Ҵ��Ѵ�

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t"); // \t�� escape���ڷ� tab�� �ǹ�
		}

		System.out.println("");

		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr[i] + "\t"); // \t�� escape���ڷ� tab�� �ǹ�
		}

		System.out.println("===============");
		System.out.println("Arrays�� ��� : ");
		System.out.println("arr ��� ��� : " + Arrays.toString(arr));
		System.out.println("arr2 ��� ��� : " + Arrays.toString(arr2)); // for����  �ʿ����.
																		

	}

}