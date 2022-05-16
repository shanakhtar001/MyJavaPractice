package JavaCodePractice;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DisplayCurrentDateAndTime {

	public static void main(String[] args) {
		
		SimpleDateFormat formatDate = new SimpleDateFormat();
		Date date = new Date();
		formatDate.setTimeZone(TimeZone.getTimeZone("IST"));
		System.out.println(formatDate.format(date));

	}

}
