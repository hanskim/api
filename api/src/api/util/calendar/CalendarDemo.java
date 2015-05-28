package api.util.calendar;

import java.util.Calendar;

/*java.util.Calendar 
 * 
 */

public class CalendarDemo {
	public static void main(String[] args) {
		String[] months = { "1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월",
				"9월", "10월", "11월", "12월" };

		/*
		 * Calendar.getInstance()는 내부적으로 스태틱이 싱글톤 패턴으로 객체를 생성하는 방식 어러개의 인스턴스를
		 * 생성하지 않도록 방지하려는 목적
		 */

		Calendar date = Calendar.getInstance();
		

		System.out.print("첫번째 현재 날짜 : ");
		System.out.print(Calendar.YEAR + "년  ");
		System.out.print(Calendar.MONTH + "월  ");  // why ? 2월이 찍히는가 ?
		System.out.print(Calendar.DATE + "일  ");
		System.out.print(Calendar.HOUR + "시  ");
		System.out.print(Calendar.MINUTE + "분  ");
		System.out.print(Calendar.SECOND + "초  ");
		
		System.out.println("");
		
		
		System.out.print("두번째 현재 날짜 : ");
		System.out.print(date.get(Calendar.YEAR) + "년 ");
		System.out.print((Calendar.MONTH)+3 + "월");
		System.out.print(date.get(Calendar.DATE) + "일");
		System.out.println("");
		
		
		
		

		System.out.print("날짜 : ");
		System.out.print(date.get(Calendar.YEAR) + "년 ");
		System.out.print(date.get(Calendar.MONTH)+1 + "월");
		System.out.print(date.get(Calendar.DATE) + "일");
		System.out.println("");

		System.out.print("시간 : ");
		System.out.print(date.get(Calendar.HOUR) + "시");
		System.out.print(date.get(Calendar.MINUTE) + "분");
		System.out.print(date.get(Calendar.SECOND) + "초");
		System.out.println("");
		


		System.out.println("===  1일 후  ===");
	
		date.add(Calendar.DATE, 1);
		//System.out.println(date);
		System.out.println(printYMD(date));

		/*
		 * java.util.GregorianCalendar 출력된다. => 오버라이딩이 필요한다.
		 */

		System.out.println("===  7일 전  ===   ");
		date.add(Calendar.DATE, -7);
		System.out.println(printYMD(date));

		/*
		 * java.util.GregorianCalendar 출력된다. => 오버라이딩이 필요한다.
		 */
		

		System.out.println("  ===  특정시간 SETTING  ===   ");
		date.add(Calendar.HOUR, 22);
		date.add(Calendar.MINUTE, 30);
		date.add(Calendar.SECOND, 46);
		System.out.println("");

		/*
		 * setting 시간값이 103045처럼 나와야 함
		 */

		System.out.println("  ===  수정된 시간 출력  ===   ");
		System.out.print(Calendar.HOUR);
		System.out.print(Calendar.MINUTE);
		System.out.print(Calendar.SECOND);
		System.out.println(printHMS(date));
		

		/*
		 * 수정된 시간값이 103045처럼 나와야 함
		 */

	}

	public static String printYMD(Calendar date) {
		return date.get(Calendar.YEAR) + "년" + date.get(Calendar.MONTH) + "월"
				+ date.get(Calendar.DATE) + "일";
		}
	
	public static String printHMS(Calendar date) {
		return date.get(Calendar.HOUR) + "시" + (date.get(Calendar.MINUTE)) + "분"
				+ date.get(Calendar.SECOND) + "초";
		}
		
		

	}

