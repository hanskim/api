package api.lang.system;

import java.sql.Date;
import java.text.SimpleDateFormat;

/*
 * CurrentTime 
 * CurentTimeMillis() ��
 * 
 */

public class CurrentTimeDemo {

	public static void main(String[] args) {
		long curTime = System.currentTimeMillis() ;  //1970�� 1�� 1�� ��Ī
		System.out.println(curTime);
		SimpleDateFormat sdf = new SimpleDateFormat("hh : mm") ;
		
		String nowTime = sdf.format(new Date(curTime));
		System.out.println(" ����ð�  : " +nowTime );
		
		
		

	}

}
