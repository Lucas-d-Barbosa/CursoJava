package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat fmt1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat fmt2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat fmt3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		fmt3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		System.out.println("-------------------------");
		Date y1 =  fmt1.parse("05/07/2002");
		Date y2 = fmt2.parse("05/07/2002 15:20:54");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(1000L * 60L * 60L * 5);
		System.out.println(fmt1.format(y1));
		System.out.println(fmt2.format(y2));
		System.out.println(fmt2.format(y3));
		System.out.println(fmt2.format(x1));
		System.out.println(fmt2.format(x2));
		System.out.println(fmt2.format(x3));
		
		System.out.println("-------------------------");
		System.out.println(fmt3.format(y1));
		System.out.println(fmt3.format(y2));
		System.out.println(fmt3.format(y3));
		System.out.println(fmt3.format(x1));
		System.out.println(fmt3.format(x2));
		System.out.println(fmt3.format(x3));
	}

}
