package p0620;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class C0620_03 {

	public static void main(String[] args) {
		//날짜 객체 - Date 객체
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy");
		System.out.println(sdf.format(date));
		System.out.println(sdf2.format(date));
//		System.out.println(date.getTime());

		//Calendar 객체
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");				
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));
		
		//currentTimeMillis
		long today = System.currentTimeMillis();
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");		
		System.out.println(sdf4.format(today));

	}

}
