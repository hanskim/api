package api.util.calendar;

import java.util.Calendar;

/*java.util.Calendar 
 * 
 */

public class CalendarDemo {
	public static void main(String[] args) {
		String[] months = { "1��", "2��", "3��", "4��", "5��", "6��", "7��", "8��",
				"9��", "10��", "11��", "12��" };

		/*
		 * Calendar.getInstance()�� ���������� ����ƽ�� �̱��� �������� ��ü�� �����ϴ� ��� ����� �ν��Ͻ���
		 * �������� �ʵ��� �����Ϸ��� ����
		 */

		Calendar date = Calendar.getInstance();
		

		System.out.print("ù��° ���� ��¥ : ");
		System.out.print(Calendar.YEAR + "��  ");
		System.out.print(Calendar.MONTH + "��  ");  // why ? 2���� �����°� ?
		System.out.print(Calendar.DATE + "��  ");
		System.out.print(Calendar.HOUR + "��  ");
		System.out.print(Calendar.MINUTE + "��  ");
		System.out.print(Calendar.SECOND + "��  ");
		
		System.out.println("");
		
		
		System.out.print("�ι�° ���� ��¥ : ");
		System.out.print(date.get(Calendar.YEAR) + "�� ");
		System.out.print((Calendar.MONTH)+3 + "��");
		System.out.print(date.get(Calendar.DATE) + "��");
		System.out.println("");
		
		
		
		

		System.out.print("��¥ : ");
		System.out.print(date.get(Calendar.YEAR) + "�� ");
		System.out.print(date.get(Calendar.MONTH)+1 + "��");
		System.out.print(date.get(Calendar.DATE) + "��");
		System.out.println("");

		System.out.print("�ð� : ");
		System.out.print(date.get(Calendar.HOUR) + "��");
		System.out.print(date.get(Calendar.MINUTE) + "��");
		System.out.print(date.get(Calendar.SECOND) + "��");
		System.out.println("");
		


		System.out.println("===  1�� ��  ===");
	
		date.add(Calendar.DATE, 1);
		//System.out.println(date);
		System.out.println(printYMD(date));

		/*
		 * java.util.GregorianCalendar ��µȴ�. => �������̵��� �ʿ��Ѵ�.
		 */

		System.out.println("===  7�� ��  ===   ");
		date.add(Calendar.DATE, -7);
		System.out.println(printYMD(date));

		/*
		 * java.util.GregorianCalendar ��µȴ�. => �������̵��� �ʿ��Ѵ�.
		 */
		

		System.out.println("  ===  Ư���ð� SETTING  ===   ");
		date.add(Calendar.HOUR, 22);
		date.add(Calendar.MINUTE, 30);
		date.add(Calendar.SECOND, 46);
		System.out.println("");

		/*
		 * setting �ð����� 103045ó�� ���;� ��
		 */

		System.out.println("  ===  ������ �ð� ���  ===   ");
		System.out.print(Calendar.HOUR);
		System.out.print(Calendar.MINUTE);
		System.out.print(Calendar.SECOND);
		System.out.println(printHMS(date));
		

		/*
		 * ������ �ð����� 103045ó�� ���;� ��
		 */

	}

	public static String printYMD(Calendar date) {
		return date.get(Calendar.YEAR) + "��" + date.get(Calendar.MONTH) + "��"
				+ date.get(Calendar.DATE) + "��";
		}
	
	public static String printHMS(Calendar date) {
		return date.get(Calendar.HOUR) + "��" + (date.get(Calendar.MINUTE)) + "��"
				+ date.get(Calendar.SECOND) + "��";
		}
		
		

	}

