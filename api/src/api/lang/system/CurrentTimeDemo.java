package api.lang.system;

import java.sql.Date;
import java.text.SimpleDateFormat;

/*
 * CurrentTime 
 * CurentTimeMillis() 는
 * 
 */

public class CurrentTimeDemo {

	public static void main(String[] args) {
		long curTime = System.currentTimeMillis() ;  //1970년 1월 1일 지칭
		System.out.println(curTime);
		SimpleDateFormat sdf = new SimpleDateFormat("hh : mm") ;
		
		String nowTime = sdf.format(new Date(curTime));
		System.out.println(" 현재시간  : " +nowTime );
		
		
		

	}

}
