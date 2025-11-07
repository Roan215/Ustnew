package Outer;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class Dates {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.getDate());
		System.out.println(d.getDay());
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(d));
		String str = "22/11/2029";
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.WEEK_OF_YEAR));
		// Date dd=sdf.parse(str);
		// System.out.println(dd.getDate());
		
		LocalTime ldt = LocalTime.now();
		System.out.println(ldt);
		System.out.println(ldt.getNano());
		System.out.println(ldt.getSecond());
	}
}
